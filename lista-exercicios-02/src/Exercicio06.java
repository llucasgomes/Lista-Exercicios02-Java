/*Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana correspondente, 
por exemplo, se a entrada for: 1, mostre Domingo; 2, exiba Segunda;... OBS.: Utilizar o comando switch case*/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int dia ;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira o dia: ");
		dia = leitor.nextInt();
		
		switch (dia) {
		case 1: System.out.println("Domingo");break;
		case 2: System.out.println("Segunda");break;
		case 3: System.out.println("Terça");break;
		case 4: System.out.println("Quarta");break;
		case 5: System.out.println("Quinta");break;
		case 6: System.out.println("Sexta");break;
		case 7: System.out.println("Sabado");break;
		default: System.out.println("Invalido");break;
			
		}
		leitor.close();

	}

}
