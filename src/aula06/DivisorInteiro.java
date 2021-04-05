package aula06;

import java.util.Scanner;

public class DivisorInteiro {

	public static void main(String[] args) throws CalculadoraException {
		try {

			Scanner input = new Scanner(System.in);
			System.out.print("Digite o numerador:");
			int numerador = input.nextInt();
			System.out.print("Digite o Denominador:");
			int denominador = input.nextInt();
			input.close();
			if (numerador <= 0 || denominador <= 0) {
				throw new CalculadoraException("Denominador não ser menor ou igual a zero !!!");
			}

			int quociente = numerador / denominador;
			int resto = numerador % denominador;
			System.out.printf("Quociente:%d Resto:%d", quociente, resto);

		} catch (CalculadoraException e) {
			System.out.println(e.getMessage());
		}

	}

}
