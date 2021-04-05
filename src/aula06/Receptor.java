package aula06;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receptor {

	public static void main(String[] args) {

		ServerSocket server = null;

		while (true) {
			try {
				server = new ServerSocket(12345);
				try {
					Socket socket = server.accept();
					ObjectInput ois = new ObjectInputStream(socket.getInputStream());
					Mensagem mens = (Mensagem) ois.readObject();
					System.out.println(mens);
					ois.close();
					socket.close();
				} finally {
					server.close();
				}

			} catch (Throwable e) {
				e.printStackTrace();
			}
		}

	}

}
