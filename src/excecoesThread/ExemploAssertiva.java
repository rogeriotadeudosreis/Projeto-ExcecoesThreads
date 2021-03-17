package excecoesThread;

import java.util.Scanner;

public class ExemploAssertiva {
	static double calcularComissao(double vendas, double porcentagem) {
		assert vendas >= 0 : "Vendas não pode ser negativo";
		assert porcentagem > 0 && porcentagem < 1 : "Porcentagem incorreta";
		return vendas * porcentagem;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite as Vendas:");
		double vendas = input.nextDouble();
		System.out.println("Digite a Comissão:");
		double porcentagem = input.nextDouble();
		double comissao = calcularComissao(vendas, porcentagem);
		System.out.printf("comissão: %.2f", comissao);
	}

}
