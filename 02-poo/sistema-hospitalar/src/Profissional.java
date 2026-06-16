package SistemaGestaoHospitalar;

public abstract class Profissional {
	protected String nome;
	protected int horasTrabalhadas;
	private static final double VALOR_HORA = 50.0;

	public Profissional(String nome, int horasTrabalhadas) {
		this.nome = nome;
		setHorasTrabalhadas(horasTrabalhadas);
	}

	public String getNome() {
		return nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas <= 0 || horasTrabalhadas > 240) {
			throw new IllegalArgumentException("Horas trabalhadas devem ser entre 1 e 240.");
		}
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioBase() {
		return horasTrabalhadas * VALOR_HORA;
	}

	public abstract double calcularSalario();

	public String exibirDados() {
		return "Nome: " + nome + " | Horas Trabalhadas: " + horasTrabalhadas;
	}
}
