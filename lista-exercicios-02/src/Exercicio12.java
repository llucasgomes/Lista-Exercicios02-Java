/*Criar um programa que receba pelo teclado 10 números inteiros. Apresentar na tela o MAIOR e o MENOR 
número lido. OBS.: Não use vetor.*/
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		int menor=0;
		int maior=0;
		int n;
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 1; i <= 5 ;i++) {
			System.out.printf("Insira o valor %sº valor: ",i);
			n = leitor.nextInt();
			
			if(i==1) {
				menor = n;
				maior = n;
			}
			
			if ( n > maior) {
				maior = n;
			}
			if (n < menor) {
				menor = n;
			}
		}
		System.out.println("Menor valor: "+menor);
		System.out.println("Maior valor: "+maior);
		leitor.close();
	}

}
