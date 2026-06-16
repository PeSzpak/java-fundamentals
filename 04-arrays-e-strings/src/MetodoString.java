package ArrAndString;

public class MetodoString {

	public static void main(String[] args) {
		String frase = "Olá, mundo";
		
		System.out.println("Frase original: " + frase);
		System.out.println("-------------------------------------");

		
		int tamanho = frase.length();
		System.out.println("Tamanho da frase: " + tamanho);
		
		String maiusculo = frase.toUpperCase();
		System.out.println("Tudo MAIUSCULO: " + maiusculo);
		
		String minusculo = frase.toLowerCase();
		System.out.println("Tudo minusculo: " + minusculo);
		
		char primeiroChar = frase.charAt(0);
		System.out.println("Primeiro Char: " + primeiroChar);
		
		String parteDaString = frase.substring(5, 10);
		System.out.println("SubString 5, 10: " + parteDaString);
		
		String novaFrase = frase.replace("Olá", "Oi");
		System.out.println("Substituição: " + novaFrase);





	}

}
