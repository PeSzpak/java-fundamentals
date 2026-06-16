package exercicios;

public class Exercicio16 {
	public void executar() {		
		for (int i = 0; i <= 15; i++) {
			long resultado = (long) Math.pow(3, i);
			System.out.println("3ˆ" + i + " = " + resultado);
		}
	}
}

/*
 * Outra lógica neste caso resultado é int
 * if (i == 0) 
 * { resultado = 1; 
 * } else {
 *  resultado *= 3; }
 */