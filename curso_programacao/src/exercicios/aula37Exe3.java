package exercicios;

import java.util.Scanner;

public class aula37Exe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		int b = sc.nextInt();
		String tipo;
		
		if (a > b) {
			if (a % b == 0) {
				tipo = "São Multiplos";
				System.out.printf("%n%d e %d %s", a, b, tipo);
			} else {
				tipo = "Não são Multiplos";
				System.out.printf("%n%d e %d %s", a, b, tipo);
			}
		} else {
			if (b % a == 0) {
				tipo = "São Multiplos";
				System.out.printf("%n%d e %d %s", a, b, tipo);
			} else {
				tipo = "Não são Multiplos";
				System.out.printf("%n%d e %d %s", a, b, tipo);
			}
		}
		
		sc.close();
	}

}
