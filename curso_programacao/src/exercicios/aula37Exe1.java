package exercicios;

import java.util.Scanner;

public class aula37Exe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro qualquer: ");
		int inteiro = sc.nextInt();
		String tipo;
		
		if (inteiro < 0) {
			tipo = "negativo";
			System.out.printf("%nO n�mero %d � %s.", inteiro, tipo);
		} else if (inteiro > 0) {
			tipo = "positivo";
			System.out.printf("%nO n�mero %d � %s.", inteiro, tipo);
		} else {
			tipo = "neutro";
			System.out.printf("%nO n�mero %d � %s.", inteiro, tipo);
		}
		
		sc.close();
	}

}
