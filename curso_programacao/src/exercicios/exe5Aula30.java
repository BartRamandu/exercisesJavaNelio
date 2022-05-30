package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exe5Aula30 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a seguir o código de uma Peça 01, a quantidade desejada e informe o valor unitário delas, respectivamente: ");
		int codigoPeca1 = sc.nextInt();
		int quantidade1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		System.out.println("Digite a seguir o código de uma Peça 02, a quantidade desejada e informe o valor unitário delas, respectivamente: ");
		int codigoPeca2 = sc.nextInt();
		int quantidade2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double totalAPagar = valor1 * quantidade1 + valor2 * quantidade2;
		
		System.out.printf("%nO valor total a se pagar nas peças - de código %d e %d - é de R$ %.2f%n", codigoPeca1, codigoPeca2, totalAPagar);
		
		sc.close();
	}

}
