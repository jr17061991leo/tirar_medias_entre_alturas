/* programa para leitura de alturas e tirar a média entre elas*/
package leitorAlturas;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.println("Digite a quantidade de alturas a serem testadas");
		int numAlturas = in.nextInt();
		double soma = 0;
		double media = 0;
		double[] alturas = new double[numAlturas];

		for (int i = 0; i < alturas.length; i++) {

			System.out.println("digite a altura na posicao " + i + ": ");
			alturas[i] = in.nextDouble();

		}
		for (int i = 0; i < alturas.length; i++) {
			soma += alturas[i];

		}
		media = soma / alturas.length;
		System.out.printf("a media é: %.2f%n", media);

		in.close(); System.out.println("bom estudo");
	}

}
