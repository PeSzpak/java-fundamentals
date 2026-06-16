package ArrAndString;

public class MaiorValorArray {

    public static void main(String[] args) {

        // Declaração e inicialização do array
        int[] valores = {15, 8, 23, 47, 32};

        // Assume inicialmente que o maior valor é o primeiro elemento
        int maiorValor = valores[0];

        // Percorre o array a partir da posição 1
        for (int i = 1; i < valores.length; i++) {
            // Compara o elemento atual com o maior valor encontrado
            if (valores[i] > maiorValor) {
                maiorValor = valores[i]; // Atualiza o maior valor
            }
        }

        // Exibe o resultado
        System.out.println("O maior valor é: " + maiorValor);     
        
    }
}


