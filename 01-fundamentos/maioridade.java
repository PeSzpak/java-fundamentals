package PrimeiraAula;

import java.util.Scanner;

public class maioridade {
        public void main() {
        Scanner Ler = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade = Ler.nextInt();

if (idade >= 18) {
            System.out.println("É maior de idade"
);
}else {
            System.out.println("É menor de idade"
);

}
    }
}
