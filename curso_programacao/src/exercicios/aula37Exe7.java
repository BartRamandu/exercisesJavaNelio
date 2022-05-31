package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aula37Exe7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a coordenada x: ");
		double x = sc.nextDouble();
		System.out.print("Digite a coordenada y: ");
		double y = sc.nextDouble();
		
		if (x > 0.0 && y > 0.0) {
			System.out.println();
			System.out.printf("De acordo com as coordenadas de X (%.1f) e Y (%.1f) o ponto está no Q1", x, y);
		} else if (x < 0.0 && y > 0.0) {
			System.out.println();
			System.out.printf("De acordo com as coordenadas de X (%.1f) e Y (%.1f) o ponto está no Q2", x, y);
		} else if (x < 0.0 && y < 0.0) {
			System.out.println();
			System.out.printf("De acordo com as coordenadas de X (%.1f) e Y (%.1f) o ponto está no Q3", x, y);
		} else if (x > 0.0 && y < 0.0) {
			System.out.println();
			System.out.printf("De acordo com as coordenadas de X (%.1f) e Y (%.1f) o ponto está no Q4", x, y);
		} else if (x > 0.0 || x < 0.0 && y == 0.0) {
			System.out.println();
			System.out.printf("De acordo com as coordenadas de X (%.1f) e Y (%.1f) o ponto está no Eixo X", x, y);
		} else if (y > 0.0 || y < 0.0 && x == 0.0) {
			System.out.println();
			System.out.printf("De acordo com as coordenadas de X (%.1f) e Y (%.1f) o ponto está no Eixo Y", x, y);
		} else {
			System.out.println();
			System.out.printf("De acordo com as coordenadas de X (%.1f) e Y (%.1f) o ponto está na Origem", x, y);
		}
		
		sc.close();
	}

}
