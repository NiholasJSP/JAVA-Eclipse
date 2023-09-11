package Pratica1;
import java.util.Scanner;

public class Losangulo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Diagonalmaior");
		double maior = input.nextDouble();
		
		System.out.println("Diagonalmenor");
		double menor = input.nextDouble();
		
		double area =  maior * menor / 2;
		
		System.out.println("valorArea:" + area);
		
	}

}
