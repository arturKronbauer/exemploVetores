package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, n2, n3;
		float media[] = new float[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe a primeira nota do aluno " + (i + 1));
			n1 = sc.nextFloat();
			System.out.println("Informe a segunda nota do aluno " + (i + 1));
			n2 = sc.nextFloat();
			System.out.println("Informe a terceira nota do aluno " + (i + 1));
			n3 = sc.nextFloat();
			media[i] = (n1 + n2 + n3) / 3;
		}

		System.out.println("---- Média dos alunos ----");
		for (int i = 0; i < 5; i++) {
			System.out.println("A média do aluno" + (i + 1) + " = " + media[i]);
		}

		System.out.println("---- Alunos aprovados ----");
		for (int i = 0; i < 5; i++) {
			if (media[i] >= 7) {
				System.out.println("Aluno " + (i + 1) + " Média = " + media[i]);
			}
		}
	}

}
