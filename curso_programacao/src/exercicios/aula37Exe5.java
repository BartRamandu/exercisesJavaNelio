package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aula37Exe5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("		CARDÁPIO");
		System.out.println("COD		ITEM				PREÇO");
		System.out.println("[1]		Cachorro Quente			R$ 4.00");
		System.out.println("[2]		X-Salada			R$ 4.50");
		System.out.println("[3]		X-Bacon				R$ 5.00");
		System.out.println("[4]		Torrada Simples			R$ 2.00");
		System.out.println("[5]		Refrigerante			R$ 1.50");
		
		System.out.println();
		System.out.print("Digite o código do item desejado: ");
		int codigo = sc.nextInt();
		System.out.print("Agora digite a quantidade que deseja: ");
		int quantidade = sc.nextInt();
		double valorTotal;
		String item;
		
		if (codigo == 1) {
			item = "Cachorro(s) Quente(s)";
			valorTotal = (double) quantidade * 4.0;
			System.out.printf("%nTotal a pagar por %d %s é de: R$ %.2f", quantidade, item, valorTotal);
		} else if (codigo == 2) {
			item = "X-Salada";
			valorTotal = (double) quantidade * 4.5;
			System.out.printf("%nTotal a pagar por %d %s é de: R$ %.2f", quantidade, item, valorTotal);
		} else if (codigo == 3) {
			item = "X-Bacon";
			valorTotal = (double) quantidade * 5.0;
			System.out.printf("%nTotal a pagar por %d %s é de: R$ %.2f", quantidade, item, valorTotal);
		} else if (codigo == 4) {
			item = "Torrada(s) Simples";
			valorTotal = (double) quantidade * 2.0;
			System.out.printf("%nTotal a pagar por %d %s é de: R$ %.2f", quantidade, item, valorTotal);
		} else if (codigo == 5) {
			item = "Refrigerante(s)";
			valorTotal = (double) quantidade * 1.5;
			System.out.printf("%nTotal a pagar por %d %s é de: R$ %.2f", quantidade, item, valorTotal);
		} else {
			System.out.println();
			System.out.println("Código digitado não reconhecido, repita o processo!");
		}
		
		sc.close();
	}

}
