//Criar um programa que leia o sal�rio de um funcion�rio. Apresente na tela o sal�rio 
//do funcion�rio com reajuste de 15%.

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
