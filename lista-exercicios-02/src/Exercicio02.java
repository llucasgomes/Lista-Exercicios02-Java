/*Criar um programa que leia pelo teclado duas notas n1 e n2 de um aluno, calcule a m�dia e exiba na tela se o 
aluno foi APROVADO ou REPROVADO. OBS.: A m�dia base para aprova��o � 6.*/

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	float res,n1,n2;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira a 1� Nota: ");
		n1 = leitor.nextFloat();
		System.out.print("Insira a 2� Nota: ");
		n2 = leitor.nextFloat();
		System.out.println("");
		
		//calculo de Media
		
		res = 2/(n1+n2);
		
		if (res < 6) {
			System.out.println("Reprovado");
			
		} else {
			System.out.println("Aprovado");
		}
		
		leitor.close();
	}

}
