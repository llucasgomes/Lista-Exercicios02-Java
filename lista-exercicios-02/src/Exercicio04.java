/*Criar um algoritmo que receba a idade de um nadador e informe a sua categoria: infantil (at� 10 anos), 
juvenil (at� 17 anos) ou s�nior (acima de 17 anos).*/

import java.util.Scanner;


public class Exercicio04 {

	public static void main(String[] args) {
		// Variaveis
		
		int idade;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Concurso de Nata��o");
		System.out.print("Insira a idade: ");
		idade = leitor.nextInt();
		
		if (idade <=10) {
			System.out.println("Faixa etaria INFANTIL");
		} else if(idade >10 && idade <= 17){
			System.out.println("Faixa etaria JUVENIL");
		}else {
			System.out.println("Faixa etaria S�NIOR");
		}
		
		leitor.close();

	}

}
