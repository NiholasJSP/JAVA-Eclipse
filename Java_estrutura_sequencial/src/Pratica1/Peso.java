package Pratica1;
import java.util.Scanner;
public class Peso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(system.in);
		
		System.out.print("Pesoatual");
		double PesoAtual = scanner.nextDouble();
		
		double novoPesoEngordar = calcularNoPesoEngordar(PesoAtual);
		double novoPesoEmagrecer = calcularNovoPesoEmagrecer(PesoAtual);
		
		System.out.println("se a pessoa engordar 15%, o novo peso será: " + novoPesoEngordar + " kg");
		System.out.println("se a pessoa emagrecer 20%, o novo peso será: " + novoPesoEmagrecer + "kg");
		
		scanner.close();
	}

	public static double calcularNovoPesoEngordar(double PesoAtual) {
		return PesoAtual * 1.15;
	}
	
	public static double calcularNovoPesoEmagrecer(double pesoAtual) {
		return PesoAtual * 0.8;
	}
	
}
