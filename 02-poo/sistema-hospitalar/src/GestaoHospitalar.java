package SistemaGestaoHospitalar;

import java.util.ArrayList;
import java.util.List;

public class GestaoHospitalar {
	private List<Profissional> listaProfissionais;

	public GestaoHospitalar() {
		this.listaProfissionais = new ArrayList<>();
	}

	public void adicionarProfissional(Profissional p) {
		listaProfissionais.add(p);
	}

	public double calcularTotalSalarios() {
		double total = 0;
		for (Profissional p : listaProfissionais) {
			total += p.calcularSalario();
		}
		return total;
	}

	public void gerarRelatorio() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("---------RELATÓRIO DE PROFISSIONAIS - GESTÃO HOSPITALAR------");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println();

		for (int i = 0; i < listaProfissionais.size(); i++) {
			System.out.println((i + 1) + ". " + listaProfissionais.get(i).exibirDados());
		}

		System.out.println();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("TOTAL DA FOLHA DE PAGAMENTO: R$ " + String.format("%.2f", calcularTotalSalarios()));
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
}
