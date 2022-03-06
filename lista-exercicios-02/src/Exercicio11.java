/*Criar um programa que receba pelo teclado um número positivo inteiro N. Apresentar na tela a soma dos N 
primeiros números, por exemplo: se N = 5, então SOMA = 1 + 2 + 3 + 4 + 5*/
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		int n,res = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.printf("Insira o valor: ");
		n = leitor.nextInt();
		
		for (int i = 1;i <= n;i++) {
			res = res + i;
		}
		System.out.println(res);
		leitor.close();
	}
	
}
