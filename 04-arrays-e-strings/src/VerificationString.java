package ArrAndString;

public class VerificationString {

	public static void main(String[] args) {
		String texto = "A programação é divertida";
		
		boolean contemPalavra = texto.contains("divertida");
		boolean comecaCom = texto.startsWith("A pro");
		boolean terminaCom = texto.endsWith("divertida");

		System.out.println("Texto: " + texto);
		System.out.println("Contem divertida? " + contemPalavra);
		System.out.println("Começa com A pro? " + comecaCom);
		System.out.println("Termina com divertida? " + terminaCom);

		System.out.println("------------------------------------");
		
		String data = "03-03-2026";
		
		String[] partes = data.split("-");
		
		String dia = partes[0];
		String mes = partes[2];
		String ano = partes[3];

		System.out.println("dia: " + dia);
		System.out.println("mês: " + mes);
		System.out.println("ano: " + ano);


		
	}

}
