package br.com.unialfa.Uri1013;

import java.util.Scanner;

/**
 * Faça um programa que leia três valores e apresente o maior dos três valores
 * lidos seguido da mensagem “eh o maior”. Utilize a fórmula: maiorAB
 * =(a+b+abs(a-b))/2
 * 
 * 
 * 
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um
 * segundo passo, portanto é necessário para chegar no resultado esperado.
 * 
 * Entrada O arquivo de entrada contém três valores inteiros.
 * 
 * Saída Imprima o maior dos três valores seguido por um espaço e a mensagem "eh
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
