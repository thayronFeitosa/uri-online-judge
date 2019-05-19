package br.com.unialfa.Uri1013;

import java.util.Scanner;

/**
 * Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores
 * lidos seguido da mensagem �eh o maior�. Utilize a f�rmula: maiorAB
 * =(a+b+abs(a-b))/2
 * 
 * 
 * 
 * Obs.: a f�rmula apenas calcula o maior entre os dois primeiros (a e b). Um
 * segundo passo, portanto � necess�rio para chegar no resultado esperado.
 * 
 * Entrada O arquivo de entrada cont�m tr�s valores inteiros.
 * 
 * Sa�da Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem "eh
 * o maior"
 * 
 * @author thayron
 *
 */

public class Uri1013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int valor = a;
		if (a < b || a < c) {
			if (b < c) {
				valor = c;
			} else {
				valor = b;
			}
		}
		scan.close();
		System.out.println(valor + " eh o maior");

	}

}
