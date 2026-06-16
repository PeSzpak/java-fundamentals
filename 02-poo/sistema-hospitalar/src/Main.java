package SistemaGestaoHospitalar;

public class Main {
	public static void main(String[] args) {
		GestaoHospitalar gestao = new GestaoHospitalar();

		gestao.adicionarProfissional(new Medico("Dr. Carlos Silva", 160, "Cardiologia", 3000.00));
		gestao.adicionarProfissional(new Medico("Dra. Ana Souza", 180, "Pediatria", 2500.00));

		gestao.adicionarProfissional(new Enfermeiro("Maria Oliveira", 200, "Sênior"));
		gestao.adicionarProfissional(new Enfermeiro("João Santos", 160, "Pleno"));
		gestao.adicionarProfissional(new Enfermeiro("Paula Lima", 140, "Junior"));

		gestao.adicionarProfissional(new TecnicoLaboratorio("Roberto Alves", 180, "Análises Clínicas"));
		gestao.adicionarProfissional(new TecnicoLaboratorio("Fernanda Costa", 160, "Microbiologia"));

		gestao.gerarRelatorio();
	}
}