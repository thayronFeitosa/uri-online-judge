package br.com.unialfa.Uri1006;
import java.util.Scanner;

/**
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um
 * aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a
 * nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0
 * até 10.0, sempre com uma casa decimal.
 * 
 * Entrada O arquivo de entrada contém 3 valores com uma casa decimal, de dupla
 * precisão (double).
 * 
 * Saída Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o
 * ponto decimal e com um espaço em branco antes e depois da igualdade. Assim
 * como todos os problemas, não esqueça de imprimir o fim de linha após o
 * resultado, caso contrário, você receberá "Presentation Error".
 * 
 * @author thayron
 *
 */

public class Uri1006 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();
		double media = ((a*2)+(b*3)+(c*5))/10;
		
		System.out.printf("MEDIA = %.1f%n", media);
	}

}
