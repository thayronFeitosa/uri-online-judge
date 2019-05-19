package br.com.unialfa.Uri1010;

import java.util.Scanner;

/**
 * Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
 * o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o valor a ser pago.
 * 
 * Entrada O arquivo de entrada cont�m duas linhas de dados. Em cada linha
 * haver� 3 valores, respectivamente dois inteiros e um valor com 2 casas
 * decimais.
 * 
 * Sa�da A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo,
 * lembrando de deixar um espa�o ap�s os dois pontos e um espa�o ap�s o "R$". O
 * valor dever� ser apresentado com 2 casas ap�s o ponto.
 * 
 * @author thayron
 *
 */

public class Uri1010 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		@SuppressWarnings("unused")
		int codigop1 = scan.nextInt();
		int numPecas1 = scan.nextInt();
		double vUnitario1 = scan.nextDouble();
		@SuppressWarnings("unused")
		int codigop2 = scan.nextInt();
		int numPecas2 = scan.nextInt();
		double vUnitario2 = scan.nextDouble();
		scan.close();
		double soma = ((numPecas1*vUnitario1)+(numPecas2*vUnitario2));
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);

	}

}
