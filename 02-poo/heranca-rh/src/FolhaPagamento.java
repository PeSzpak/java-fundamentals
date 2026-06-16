package ExemploHeranca;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
	private List<Empregado> emp;
	
	public FolhaPagamento () {
		emp = new ArrayList<>();
	}
	
	public void addEmpregado(Empregado e) {
		emp.add(e);
	}
	
	public double calcularSalarioTotal() {
		double total = 0;
		for (Empregado e: emp) {
			total += e.calcularSalario();
		}
		return total;
	}
	
	public void exibirFolha() {
		for (Empregado e: emp) {
			System.out.println(e.getNome()+ ": R$" + e.calcularSalario());
		}
		System.out.println("Total a pagar:  R$" + calcularSalarioTotal());
	}
}
