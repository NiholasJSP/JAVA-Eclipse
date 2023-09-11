package Pratica1;
import java.util.Scanner;

public class Esfera {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Raio");
			double Raio = scanner.nextDouble();
			double comprimentoEsfera = 2 * Math.PI * Raio;
			double areaEsfera = Math.PI * Math.pow(Raio, comprimentoEsfera);
			double volumeesfera = (3.0/4.0) * Math.PI * Math.pow(Raio, 3);
		System.out.println("comprimento da esfera: " + comprimentoEsfera);
		System.out.println("área da esfera: " + areaEsfera);
		System.out.println("volume da esfera: " + volumeesfera);
	
		}
	

	}

}
