/*Criar um programa que leia os valores A e B, compare se a soma de A e B � divis�vel por 2 e imprima a 
resposta na tela.*/
import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int a,b;
		
		
		System.out.printf("Insira o valor 1�:");
		a = leitor.nextInt();
		System.out.printf("Insira o valor 2�:");
		b = leitor.nextInt();
		
		
		
		if ((a +b)%2 == 0) {
			System.out.printf("SIM! o valor � divisivel por 2");
		}else {
			System.out.printf("N�O! o valor n�o � divisivel por 2");
		}
		
		leitor.close();
	}

}
