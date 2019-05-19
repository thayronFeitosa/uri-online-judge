package br.com.unialfa.Uri1004;

import java.util.Scanner;

/**
 * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois
 * valores e atribua esta operação à variável PROD. A seguir mostre a variável
 * PROD com mensagem correspondente.
 * 
 * Entrada O arquivo de entrada contém 2 valores inteiros.
 * 
 * Saída Imprima a variável PROD conforme exemplo abaixo, com um espaço em
 * branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha
 * após o produto, caso contrário seu programa apresentará a mensagem:
 * “Presentation Error”.
 * 
 * @author thayron
 *
 */

public class Uri1004 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int PROD  = a * b;
		scan.close();
		System.out.println("PROD = "+PROD );

	}
}
