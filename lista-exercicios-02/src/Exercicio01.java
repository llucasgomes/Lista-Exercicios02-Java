//Criar um programa que leia o salário de um funcionário. Apresente na tela o salário 
//do funcionário com reajuste de 15%.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		double salario,res;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o salario a ser reajustado: R$");
		salario = teclado.nextFloat();
		
		res = salario+salario * 0.15;
		
		System.out.println("o salario reajustavo com 15% ser: "+ res);
		teclado.close();

	}

}
