package excecoesThread;

import java.util.Scanner;

public class DivisorInteiro {

	public static void main(String[] args) {
		try {

			Scanner input = new Scanner(System.in);
			System.out.print("Digite o numerador:");
			int numerador = input.nextInt();
			System.out.print("Digite o Denominador:");
			int denominador = input.nextInt();
			int quociente = numerador / denominador;
			int resto = numerador % denominador;
			System.out.printf("Quociente:%d Resto:%d", quociente, resto);
	
		} catch (Exception e) {
			System.out.println("Erro: Não é possível dividir numerador por 0 <zero>");
		}

	}

}
