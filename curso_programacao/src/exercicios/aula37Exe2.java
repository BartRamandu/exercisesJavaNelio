package exercicios;

import java.util.Scanner;

public class aula37Exe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro qualquer: ");
		int inteiro = sc.nextInt();
		String tipo;
		
		if (inteiro % 2 == 0) {
			tipo = "par";
			System.out.printf("%nO número %d é %s.", inteiro, tipo);
		} else {
			tipo = "impar";
			System.out.printf("%nO número %d é %s.", inteiro, tipo);
		}
		
		sc.close();
	}

}
