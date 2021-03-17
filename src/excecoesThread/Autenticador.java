package excecoesThread;

import java.util.Scanner;

public class Autenticador {
	public void autenticar(String login, String senha) throws DadosIncorretosException {
		if (login.length() == 0 || senha.length() == 0) {
			throw new DadosIncorretosException("Dados incompletos");
		}
		if (!login.equals("rogerio") || !senha.equals("123456")) {
			throw new DadosIncorretosException("senha não confere");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o login:");
		String login = input.nextLine();
		System.out.print("Digite a senha:");
		String senha = input.nextLine();
		Autenticador autenticador = new Autenticador();

		try {
			autenticador.autenticar(login, senha);
			System.out.println("AUTENTICADO !!");

		} catch (Exception e) {
			System.out.println("ocorreu o erro:" + e.getMessage());
		}
	}
}
