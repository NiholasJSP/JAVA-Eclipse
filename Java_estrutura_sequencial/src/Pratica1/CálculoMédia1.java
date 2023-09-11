package Pratica1;

import java.util.Scanner;

public class CálculoMédia1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Primeira Nota:");
		double Nota1 = input.nextDouble();
		System.out.println("Segunda Nota:");
		double Nota2 = input.nextDouble();
		System.out.println("Terceira Nota:");
		double Nota3 = input.nextDouble();
		double Média = (Nota1 + Nota2 + Nota3) / 3;
		System.out.println("A média das notas é:" + Média);
		input.close();		
	}
}
