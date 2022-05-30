package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exe6Aula30 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		double a = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		double b = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		double c = sc.nextDouble();
		
		double pi = 3.14159;
		
		double areaTriangulo = (a * c)/2;
		double areaCirculo = pi * Math.pow(c, 2.0);
		double areaTrapezio = ((a + b) * c)/2;
		double areaQuadrado = Math.pow(b, 2.0);
		double areaRetangulo = a * b;
		
		System.out.printf("%nA �rea do Tri�ngulo Ret�ngulo � de: %.3f%n", areaTriangulo);
		System.out.printf("A �rea do C�rculo � de: %.3f%n", areaCirculo);
		System.out.printf("A �rea do Trap�zio � de: %.3f%n", areaTrapezio);
		System.out.printf("A �rea do Quadrado � de: %.3f%n", areaQuadrado);
		System.out.printf("A �rea do Ret�ngulo � de: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
