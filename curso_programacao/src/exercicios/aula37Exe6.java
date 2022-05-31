package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aula37Exe6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor real de 0 a 100: ");
		double valor = sc.nextDouble();
		
		if (valor >= 0.0 && valor <= 25.0) {
			System.out.printf("%n%.2f se encontra no Intervalo entre [0 - 25]", valor);
		} else if (valor >= 25.01 && valor <= 50.0) {
			System.out.printf("%n%.2f se encontra no Intervalo entre [25 - 50]", valor);
		} else if (valor >= 50.01 && valor <= 75.0) {
			System.out.printf("%n%.2f se encontra no Intervalo entre [50 - 75]", valor);
		} else if (valor >= 75.01 && valor <= 100.0) {
			System.out.printf("%n%.2f se encontra no Intervalo entre [75 - 100]", valor);
		} else {
			System.out.println();
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}

}
