package br.com.unialfa.Uri1003;

import java.util.Scanner;

/**
 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a
 * soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta
 * variável.
 * 
 * Entrada O arquivo de entrada contém 2 valores inteiros.
 * 
 * Saída Imprima a variável SOMA com todas as letras maiúsculas, com um espaço
 * em branco antes e depois da igualdade seguido pelo valor correspondente à
 * soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de
 * linha após o resultado, caso contrário, você receberá "Presentation Error"
 * 
 * @author thayron
 *
 */

public class Uri1003 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int soma = a + b;
		scan.close();
		System.out.println("SOMA = "+soma);
		
	}

}
