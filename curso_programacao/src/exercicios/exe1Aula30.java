package exercicios;

import java.util.Scanner;

public class exe1Aula30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int x = sc.nextInt();
		System.out.print("Informe o segundo valor: ");
		int y = sc.nextInt();
		
		int soma = x + y;
		
		System.out.printf("%nA SOMA de %d com %d é igual a %d.%n", x, y, soma);
		
		sc.close();
	}

}
