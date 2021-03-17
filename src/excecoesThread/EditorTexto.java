package excecoesThread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EditorTexto extends JFrame implements ActionListener {
	JButton botaoAbrir = new JButton("Abrir");
	JButton botaoSalvar = new JButton("Salvar");
	JTextArea areaTexto = new JTextArea();

	public EditorTexto() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(botaoAbrir, BorderLayout.NORTH);
		c.add(botaoSalvar, BorderLayout.SOUTH);
		c.add(new JScrollPane(areaTexto), BorderLayout.CENTER);
		botaoAbrir.addActionListener(this);
		botaoSalvar.addActionListener(this);
		setTitle("Editor de Texto");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
	}

	public static void main(String[] args) {
		EditorTexto et = new EditorTexto();
	}
}
