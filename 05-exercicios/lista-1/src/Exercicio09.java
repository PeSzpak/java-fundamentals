package exercicios;

import java.util.Scanner;

public class Exercicio09 {
public void executar(){
	
	Scanner Ler = new Scanner(System.in);
	
	int valor;
	
	System.out.println("Digite um valor INTEIRO: ");
	valor = Ler.nextInt();
	
	if (valor >= 1 && valor <= 9 ) {
		System.out.println("O valor está na faixa permitida de 1 a 9 - " + valor);
	} else {
		System.out.println("O valor informado não pertence a faixa de 1 a 9 - " + valor);

	}
}
}
