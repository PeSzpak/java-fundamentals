package br.com.pedro.exercicio;


public class ContaEspacos {
    public static void main(String[] args) throws Exception {
        int espacos = 0;
        char c;

        System.out.println("Digite caracteres (termine com '.'):");

        do {
            c = (char) System.in.read();
            if (c == ' ') espacos++;
        } while (c != '.');

        System.out.println("Total de espaços: " + espacos);
    }
}