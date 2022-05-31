package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aula37Exe8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("RENDA				IR");
		System.out.println("de R$ 0.00 até R$ 2000.00	Isento");
		System.out.println("de R$ 2000.01 até R$ 3000.00	8%");
		System.out.println("de R$ 3000.01 até R$ 4500.00	18%");
		System.out.println("acima de R$ 4500.00		28%");
		System.out.println();
		System.out.println("Olá, Lisarbiano! Digite o valor do seu salário a seguir");
		System.out.print("que lhe diremos quanto de IR você tem de pagar: R$ ");
		double salario = sc.nextDouble();
		double per1 = 0.08, per2 = 0.18, per3 = 0.28, valorIR;
		
		if (salario >= 2000.01 && salario <= 3000.00) {
			valorIR = (salario - 2000.00) * per1;
			System.out.printf("%nVocê precisa pagar R$ %.2f de Imposto de Renda ao Estado", valorIR);
		} else if (salario >= 3000.01 && salario <= 4500.00) {
			valorIR = 80 + ((salario - 3000.00) * per2);
			System.out.printf("%nVocê precisa pagar R$ %.2f de Imposto de Renda ao Estado", valorIR);
		} else if (salario > 4500.00) {
			valorIR = 80 + 270 + ((salario - 4500.00) * per3);
			System.out.printf("%nVocê precisa pagar R$ %.2f de Imposto de Renda ao Estado", valorIR);
		} else {
			System.out.println();
			System.out.println("Olha que coisa boa, tu é Isento, meu chapa!");
		}
		
		sc.close();
	}

}
