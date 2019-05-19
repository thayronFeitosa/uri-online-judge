package br.com.unialfa.Uri1008;
import java.util.Scanner;

/**
 * Timelimit: 1 Escreva um programa que leia o n�mero de um funcion�rio, seu
 * n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio
 * desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com
 * duas casas decimais.
 * 
 * Entrada O arquivo de entrada cont�m 2 n�meros inteiros e 1 n�mero com duas
 * casas decimais, representando o n�mero, quantidade de horas trabalhadas e o
 * valor que o funcion�rio recebe por hora trabalhada, respectivamente.
 * 
 * Sa�da Imprima o n�mero e o sal�rio do funcion�rio, conforme exemplo
 * fornecido, com um espa�o em branco antes e depois da igualdade. No caso do
 * sal�rio, tamb�m deve haver um espa�o em branco ap�s o $.
 * 
 * @author thayron
 *
 */

public class Uri1007 {
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		int horas = scan.nextInt();
		double vHoras = scan.nextDouble();
		double hTrabalhados = (vHoras * horas);
		scan.close();
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",num,hTrabalhados);
	}

}
