/*Criar um programa que leia os valores A e B, compare se a soma de A e B é divisível por 2 e imprima a 
resposta na tela.*/
import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int a,b;
		
		
		System.out.printf("Insira o valor 1º:");
		a = leitor.nextInt();
		System.out.printf("Insira o valor 2º:");
		b = leitor.nextInt();
		
		
		
		if ((a +b)%2 == 0) {
			System.out.printf("SIM! o valor é divisivel por 2");
		}else {
			System.out.printf("NÃO! o valor não é divisivel por 2");
		}
		
		leitor.close();
	}

}
