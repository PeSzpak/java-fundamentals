package ArrAndString;

public class BuscaElemento {

    public static void main(String[] args) {

        // Declaração e inicialização do array
        String[] palavras = {"java", "python", "c++", "ruby"};

        // Elemento que desejamos encontrar
        String procurada = "c++";

        // Variável de controle
        boolean encontrada = false;

        // Percorrendo o array usando for-each
        for (String palavra : palavras) {

            if (palavra.equals(procurada)) {
                encontrada = true;
                break; // Interrompe o laço ao encontrar
            }
        }

        // Verificação final
        if (encontrada) {
            System.out.println("A linguagem foi encontrada.");
        } else {
            System.out.println("A linguagem não foi encontrada.");
        }
        
        int[] numeros = {10, 20, 30, 40};

        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        
        
    }
    
}
