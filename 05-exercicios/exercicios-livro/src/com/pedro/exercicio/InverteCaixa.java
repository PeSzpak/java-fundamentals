package br.com.pedro.exercicio;

public class InverteCaixa {
    public static void main(String[] args) throws Exception {
        int alteracoes = 0;
        char c;

        System.out.println("Digite texto (termine com '.'):");

        do {
            c = (char) System.in.read();
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
                alteracoes++;
            } else if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32); 
                alteracoes++;
            }
            if (c != '\n' && c != '\r') System.out.print(c);
        } while (c != '.');

        System.out.println("\nTotal de alterações: " + alteracoes);
    }
}