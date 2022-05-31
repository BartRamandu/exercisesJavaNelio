package exercicios;

import java.util.Scanner;

public class aula37Exe4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora em que o jogo começou [0 a 23]: ");
		int horaComecou = sc.nextInt();
		System.out.print("Digite a hora em que o jogo terminou [0 a 23]: ");
		int horaTerminou = sc.nextInt();
		int horaVirada, horaTotal;
		
		if (horaComecou >= 0 && horaTerminou >= 0 && horaComecou <= 23 && horaTerminou <= 23) {
			if (horaComecou > horaTerminou) {
				horaVirada = 24 - horaComecou;
				horaTotal = horaTerminou + horaVirada;
				System.out.printf("%nO jogo durou %d Hora(s)", horaTotal);
			} else if (horaComecou < horaTerminou) {
				horaTotal = horaTerminou - horaComecou;
				System.out.printf("%nO jogo durou %d Hora(s)", horaTotal);
			} else if (horaComecou == horaTerminou) {
				horaTotal = (horaComecou + 24) - horaTerminou;
				System.out.printf("%nO jogo durou %d Hora(s)", horaTotal);
			}
		} else {
			System.out.println();
			System.out.println("Ao menos um dos horários não foi passado corretamente, tente novamente!");
		}
		
		sc.close();
	}

}
