/*Criar um programa que leia pelo teclado um valor inteiro e diga se � par ou �mpar.*/

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int valor;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criar um programa que leia pelo teclado um valor inteiro e diga se � par ou �mpar.");
		System.out.println("");
		System.out.print("Insira o valor: ");
		valor = leitor.nextInt();
		
		valor = valor % 2;
		
		switch (valor) {
		case 0:
			System.out.println("PAR");
			break;

		default:
			System.out.println("�mpar");
			break;
		}
		leitor.close();

	}

}
