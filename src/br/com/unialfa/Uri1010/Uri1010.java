package br.com.unialfa.Uri1010;

import java.util.Scanner;

/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
 * o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 * 
 * Entrada O arquivo de entrada contém duas linhas de dados. Em cada linha
 * haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas
 * decimais.
 * 
 * Saída A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O
 * valor deverá ser apresentado com 2 casas após o ponto.
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
