package ArrAndString;

public class ManipulacaoAvancadaString {
	public static void main(String[] args) {
		 String textoComEspacos = "   Olá,   ";
	        String semEspacos = textoComEspacos.trim();

	        System.out.println("Texto original: '" + textoComEspacos + "'");
	        System.out.println("Após trim(): '" + semEspacos + "'");
	        System.out.println("------------------------------------");

	        String nome = "Lucas Luciano";
	        int idade = 28;

	        String mensagem = String.format("Nome: %s, Idade: %d", nome, idade);

	        System.out.println("Mensagem formatada:");
	        System.out.println(mensagem);
	        System.out.println("------------------------------------");
	        
	        	        String palavra1 = "java";
	        String palavra2 = "Java";

	        boolean saoIguaisIgnorandoCase = palavra1.equalsIgnoreCase(palavra2);

	        System.out.println("Comparação entre '" + palavra1 + "' e '" + palavra2 + "'");
	        System.out.println("equalsIgnoreCase(): " + saoIguaisIgnorandoCase);
	}
}