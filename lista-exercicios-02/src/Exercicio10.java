/*Criar um programa que leia os valores A, B, N, compare se a soma de A e B � divis�vel por N e imprima a 
resposta na tela.*/
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int a,b,n;
		
		
		System.out.printf("Insira o valor 1�:");
		a = leitor.nextInt();
		System.out.printf("Insira o valor 2�:");
		b = leitor.nextInt();
		System.out.printf("Insira o valor a dividir:");
		n = leitor.nextInt();
		
		
		
		if ((a +b)%n == 0) {
			System.out.printf("SIM! o valor � divisivel por "+n);
		}else {
			System.out.printf("N�O! o valor n�o � divisivel por "+n);
		}
		leitor.close();
	}

}
