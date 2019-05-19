package br.com.unialfa.Uri1012;

import java.util.Scanner;

/**
 * Escreva um programa que leia três valores com ponto flutuante de dupla
 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
 * e B. Entrada O arquivo de entrada contém três valores com um dígito após o
 * ponto decimal.
 * 
 * Saída O arquivo de saída deverá conter 5 linhas de dados. Cada linha
 * corresponde a uma das áreas descritas acima, sempre com mensagem
 * correspondente e um espaço entre os dois pontos e o valor. O valor calculado
 * deve ser apresentado com 3 dígitos após o ponto decimal.
 * 
 * @author thayron
 *
 */

public class Uri1012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double ra = (a * c) / 2;
		double rb = (c * c) * 3.14159;
		double rc = (c * (a + b)) / 2;
		double rd = (b * b);
		double re = (a * b);
		scan.close();

		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", ra, rb, rc,
				rd, re);

	}

}