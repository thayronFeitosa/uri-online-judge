package br.com.unialfa.Uri1007;

import java.util.Scanner;

/**
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
 * diferen�a do produto de A e B pelo produto de C e D segundo a f�rmula:
 * DIFERENCA = (A * B - C * D).
 * 
 * Entrada O arquivo de entrada cont�m 4 valores inteiros.
 * 
 * Sa�da Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme
 * exemplo abaixo, com um espa�o em branco antes e depois da igualdade
 * 
 * @author thayron
 *
 */

public class Uri1007 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();
		int diferenca = (a * b - c * d);
		
		System.out.println("DIFERENCA = "+ diferenca);
		

	}
}
