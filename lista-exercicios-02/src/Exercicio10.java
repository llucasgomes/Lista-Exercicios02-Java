/*Criar um programa que leia os valores A, B, N, compare se a soma de A e B é divisível por N e imprima a 
resposta na tela.*/
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int a,b,n;
		
		
		System.out.printf("Insira o valor 1º:");
		a = leitor.nextInt();
		System.out.printf("Insira o valor 2º:");
		b = leitor.nextInt();
		System.out.printf("Insira o valor a dividir:");
		n = leitor.nextInt();
		
		
		
		if ((a +b)%n == 0) {
			System.out.printf("SIM! o valor é divisivel por "+n);
		}else {
			System.out.printf("NÃO! o valor não é divisivel por "+n);
		}
		leitor.close();
	}

}
