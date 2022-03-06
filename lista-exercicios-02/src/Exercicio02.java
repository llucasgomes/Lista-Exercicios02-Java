/*Criar um programa que leia pelo teclado duas notas n1 e n2 de um aluno, calcule a média e exiba na tela se o 
aluno foi APROVADO ou REPROVADO. OBS.: A média base para aprovação é 6.*/

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	float res,n1,n2;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira a 1ª Nota: ");
		n1 = leitor.nextFloat();
		System.out.print("Insira a 2ª Nota: ");
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
