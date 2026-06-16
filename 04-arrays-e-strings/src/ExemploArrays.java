package ArrAndString;

public class ExemploArrays {
    
	public static void main(String[] args) {
        // 1. Array de inteiros com tamanho definido
        int[] numeros = new int[5]; // Array com 5 posições
        
        // Atribuindo valores manualmente
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        System.out.println("Array de inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        System.out.println("----------------------------------");
        
        // 2. Array de double com inicialização direta
        double[] precos = {10.5, 20.0, 30.75};

        System.out.println("Array de preços:");
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Preço na posição " + i + ": " + precos[i]);
        }
        System.out.println("----------------------------------");

        // 3. Array de Strings com inicialização direta
        String[] nomes = {"Alice", "Bob", "Carol"};
        System.out.println("Array de nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome na posição " + i + ": " + nomes[i]);
        }
        System.out.println("----------------------------------");
        
        // Exemplo de acesso direto
        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Quantidade de nomes: " + nomes.length);
    }
}