package aula06;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Emissor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mensagem;
		do {
			System.out.println("Digite a mensagem:");
			mensagem = input.nextLine();
			Mensagem mens = new Mensagem("Rogério", mensagem);
			try {
				Socket socket = new Socket("127.0.0.1", 12345);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(mens);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (!mensagem.equals("sair"));
	}

}
