package SistemaGestaoHospitalar;

public class Medico extends Profissional {
	private String especialidade;
	private double bonusPorPlantao;

	public Medico(String nome, int horasTrabalhadas, String especialidade, double bonusPorPlantao) {
		super(nome, horasTrabalhadas);
		this.especialidade = especialidade;
		this.bonusPorPlantao = bonusPorPlantao;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public double getBonusPorPlantao() {
		return bonusPorPlantao;
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase() + bonusPorPlantao;
	}

	@Override
	public String exibirDados() {
		return super.exibirDados() + " | Cargo: Médico" + " | Especialidade: " + especialidade
				+ " | Bônus por Plantão: R$ " + String.format("%.2f", bonusPorPlantao) + " | Salário: R$ "
				+ String.format("%.2f", calcularSalario());
	}
}
