package Pratica1;

import javax.swing.JOptionPane;
public class SalariominimoDialogo {

	public static void main(String[] args) {
			String salario minimoStr = JOptionpane.showInputDialog("Valorsalario:");
			double salario = Double.parsedouble(salárioStr);
			
			String minimoStr = JOptionPane.showInputDialog("salário minimo: ");
			double minimo = Double.parseDouble(minimoStr);
			
			double numerosalarios = salario / minimo;
			
			JOptionPane.showMessageDialog(null, "salário" + numerosalarios + "salariominimo.");
			
			system.exit(0);

	}

}
