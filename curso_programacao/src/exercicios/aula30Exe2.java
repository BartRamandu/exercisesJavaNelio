package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aula30Exe2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe o valor do Raio do C�rculo: ");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double areaCirculo = pi * Math.pow(raio, 2.0);
		
		System.out.printf("%nO valor da �rea do C�rculo � de %.4f.%n", areaCirculo);
		
		sc.close();
	}

}
