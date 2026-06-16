package SistemaGestaoHospitalar;

public class Enfermeiro extends Profissional {
	private String nivel;

	public Enfermeiro(String nome, int horasTrabalhadas, String nivel) {
		super(nome, horasTrabalhadas);
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	@Override
	public double calcularSalario() {
		double salario = getSalarioBase();
		switch (nivel) {
		case "Junior":
			salario *= 1.05;
			break;
		case "Pleno":
			salario *= 1.10;
			break;
		case "Sênior":
			salario *= 1.20;
			break;
		}
		return salario;
	}

	@Override
	public String exibirDados() {
		return super.exibirDados() + " | Cargo: Enfermeiro" + " | Nível: " + nivel + " | Salário: R$ "
				+ String.format("%.2f", calcularSalario());
	}
}
