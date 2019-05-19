package br.com.unialfa.Uri1009;

import java.util.Scanner;

/**
 * Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total
 * de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor
 * ganha 15% de comiss�o sobre suas vendas efetuadas, informar o total a receber
 * no final do m�s, com duas casas decimais.
 * 
 * Entrada O arquivo de entrada cont�m um texto (primeiro nome do vendedor) e 2
 * valores de dupla precis�o (double) com duas casas decimais, representando o
 * sal�rio fixo do vendedor e montante total das vendas efetuadas por este
 * vendedor, respectivamente.
 * 
 * Sa�da Imprima o total que o funcion�rio dever� receber, conforme exemplo
 * fornecido.
 * 
 * @author thayron
 *
 */

public class Uri1009 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		@SuppressWarnings("unused")
		String nome = scan.nextLine();
		double salario = scan.nextDouble();
		double totalVenda = scan.nextDouble();
		double total = (totalVenda *0.15)+salario;
		scan.close();
		
		System.out.printf("TOTAL = R$ %.2f\n",total);
	}

}
