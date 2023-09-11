package Pratica1;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Salario");
		double salario = input.nextDouble();
				
		double taxa = salario * taxa;
		
		double aumento = salario * taxa;
		
		double novosalario = salario + aumento;
		
		System.out.println("salario:" + novosalario);
		
		System.exit(0);

	}

}
