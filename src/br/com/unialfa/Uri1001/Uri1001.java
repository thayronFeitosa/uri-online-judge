package br.com.unialfa.Uri1001;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros e armazene-os nas vari�veis A e B. Efetue a soma de A
 * e B atribuindo o seu resultado na vari�vel X. Imprima X conforme exemplo
 * apresentado abaixo. N�o apresente mensagem alguma al�m daquilo que est� sendo
 * especificado e n�o esque�a de imprimir o fim de linha ap�s o resultado, caso
 * contr�rio, voc� receber� "Presentation Error".
 * 
 * Entrada A entrada cont�m 2 valores inteiros.
 * 
 * Sa�da Imprima a mensagem "X = " (letra X mai�scula) seguido pelo valor da
 * vari�vel X e pelo final de linha. Cuide para que tenha um espa�o antes e
 * depois do sinal de igualdade, conforme o exemplo abaixo.
 */
public class Uri1001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, x;
		a = scan.nextInt();
		b = scan.nextInt();
		x = a + b;
		scan.close();
		System.out.println("X = " + x);
		System.out.println("sassssssssssssss");

	}

}
