/*Criar um programa em Java que receba pelo teclado 10 números inteiros e informe quantos números 
digitados são ímpares.*/
import java.util.Scanner;


public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int xImpar = 0;
		
		for ( int i=1; i<=10;i++) {
			System.out.printf("Insira o %sº valor: ",i);
			int n = leitor.nextInt();
			
			if ( n%2 != 0) {
				xImpar++;
			}
		}
		System.out.println("A quantidade de Numeros Impares é "+xImpar);
		leitor.close();
		
		
		
		
		
		
	}

}
