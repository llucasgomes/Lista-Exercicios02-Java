/*Criar um algoritmo que receba a idade de um nadador e informe a sua categoria: infantil (até 10 anos), 
juvenil (até 17 anos) ou sênior (acima de 17 anos).*/

import java.util.Scanner;


public class Exercicio04 {

	public static void main(String[] args) {
		// Variaveis
		
		int idade;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Concurso de Natação");
		System.out.print("Insira a idade: ");
		idade = leitor.nextInt();
		
		if (idade <=10) {
			System.out.println("Faixa etaria INFANTIL");
		} else if(idade >10 && idade <= 17){
			System.out.println("Faixa etaria JUVENIL");
		}else {
			System.out.println("Faixa etaria SÊNIOR");
		}
		
		leitor.close();

	}

}
