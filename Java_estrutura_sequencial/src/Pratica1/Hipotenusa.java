package Pratica1;
import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cateto A");
		double CatetoA = scanner.nextDouble();
		
		System.out.println("Cateto B");
		double CatetoB = scanner.nextDouble();
		double Hipotenusa = Math.sqrt(CatetoB) + Math.sqrt(CatetoA);
		
		System.out.println("Valor da Hipotenusa: " + Hipotenusa);
		scanner.close();
		

	}

}
