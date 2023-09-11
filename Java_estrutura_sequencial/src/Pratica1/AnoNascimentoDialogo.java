package Pratica1;

import javax.swing.JOptionPane;

public class AnoNascimentoDialogo {
	public static void main(String[] args) {
		
String nascimentoStr = JOptionPane.showInputdialog("AnoNascimento");
int AnoNascimento = Integer.parseInt(nascimentoStr);

String anoatualStr = JOptionPane.showInputdialog("AnoAtual");
int AnoAtual = Integer.parseInt(anoatualStr);

int idadeAtual = AnoAtual - AnoNascimento;

int ano2050 = 2050;
int idade2050 = ano2050 - AnoNascimento;

JOptionPane.showMessageDialog(null, "Idade atual: " + idadeAtual + "anos.");
JOptionPane.showMessageDialog(null, "Idade em 2050: " + idade2050 + "anos.");
	}

}
