package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aula30Exe4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do funcionário: ");
		int codigoFuncionario = sc.nextInt();
		System.out.print("Digite quantas horas foram trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor por hora trabalhada: ");
		double valorPorHora = sc.nextDouble();
		
		double salario = (double) horasTrabalhadas * valorPorHora;
		
		System.out.printf("%nO código do funcionário é %d.%nSeu salário foi de R$ %.2f%n", codigoFuncionario, salario);
		
		sc.close();
	}

}
