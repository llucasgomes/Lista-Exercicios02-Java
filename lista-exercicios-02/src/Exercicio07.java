/*Fa�a um programa que receba um n�mero inteiro entre 1 e 12 e informe o m�s correspondente, por 
exemplo, se a entrada for: 1, exiba Janeiro; 2, exiba Fevereiro;... OBS.: Utilizar o comando switch case*/
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {


		int mes ;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira o mes: ");
		mes = leitor.nextInt();
		
		switch (mes) {
		case 1: System.out.println("Janeiro");break;
		case 2: System.out.println("Fevereiro");break;
		case 3: System.out.println("Mar�o");break;
		case 4: System.out.println("Abril");break;
		case 5: System.out.println("Maio");break;
		case 6: System.out.println("Junho");break;
		case 7: System.out.println("Julho");break;
		case 8: System.out.println("Agosto");break;
		case 9: System.out.println("Setembro");break;
		case 10: System.out.println("Outubro");break;
		case 11: System.out.println("Novembro");break;
		case 12: System.out.println("Dezembro");break;
		default: System.out.println("Invalido");break;
			
		}
		leitor.close();

	}

}
