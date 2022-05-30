package exercicios;

import java.util.Scanner;

public class exe3Aula30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe valor de A: ");
		int a = sc.nextInt();
		System.out.print("Informe valor de B: ");
		int b = sc.nextInt();
		System.out.print("Informe valor de C: ");
		int c = sc.nextInt();
		System.out.print("Informe valor de D: ");
		int d = sc.nextInt();
		
		int diferenca = a * b - c * d;
		
		System.out.printf("%nA diferença do produto de %d e %d pelo produto de %d e %d é de %d.%n", a, b, c , d, diferenca);
		
		sc.close();
	}

}
