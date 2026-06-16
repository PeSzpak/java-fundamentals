package SistemaGestaoHospitalar;

public class TecnicoLaboratorio extends Profissional {
	private String laboratorio;

	public TecnicoLaboratorio(String nome, int horasTrabalhadas, String laboratorio) {
		super(nome, horasTrabalhadas);
		this.laboratorio = laboratorio;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase();
	}

	@Override
	public String exibirDados() {
		return super.exibirDados() + " | Cargo: Técnico de Laboratório" + " | Laboratório: " + laboratorio
				+ " | Salário: R$ " + String.format("%.2f", calcularSalario());
	}
}
