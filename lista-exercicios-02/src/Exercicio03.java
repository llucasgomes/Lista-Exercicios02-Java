/*As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se forem compradas pelo 
menos 12. Crie um programa que receba a quantidade de ma��s compradas, calcule e escreva o custo total da 
compra.*/

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Var
		
		double compra,fruta;
		Scanner leitor = new Scanner(System.in);
		
		// Informa��es de compra
		
		System.out.print("Quantas ma��s: ");
		fruta = leitor.nextDouble();
		
		
		if (fruta < 12) {
			compra = fruta * 1.3;
			System.out.println("O valor de sua compra foi R$:"+compra);
			
		} else {
			compra = fruta * 1;
			System.out.println("O valor de sua compra foi R$:"+compra);

		}
		leitor.close();
		

	}

}
