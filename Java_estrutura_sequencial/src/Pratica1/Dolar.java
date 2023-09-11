package Pratica1;
import javax.swing.JOptionPane;
public class Dolar {

	public static void main(String[] args) {
		Object Dolar;
		Object valordolar = null;
		String cotacaostr = JOptionPane.showInputDialog(null, "valordolar:");
		double cotacao = Double.parseDouble(cotacaostr);
		
		String valordolarStr = JOptionPane.showInputDialog("valordolar:", valordolar);
		double valordolar1 =- Double.parseDouble(valordolarStr);
		
		double real = valordolar1 * cotacao;
		
		JOptionPane.showMessageDialog(null, "valor em R$ é :"+ real );
		
		System.exit(0);
	}

}
