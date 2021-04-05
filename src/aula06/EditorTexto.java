package aula06;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EditorTexto extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
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
		JFileChooser jfc = new JFileChooser();
		try {
			if (e.getSource() == botaoAbrir) {
				jfc.showOpenDialog(this);
				File file = jfc.getSelectedFile();
				abrirArquivo(file);
			} else if (e.getSource() == botaoSalvar) {
				jfc.showSaveDialog(this);
				File file = jfc.getSelectedFile();
				salvarArquivo(file);
			}
		} catch (FileNotFoundException e1) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado!");
		}
	}

	public static void main(String[] args) {
		EditorTexto et = new EditorTexto();
	}

	private void salvarArquivo(File file) throws FileNotFoundException {
		Formatter saida = new Formatter(file);
		StringTokenizer token = new StringTokenizer(areaTexto.getText(), "\n");
		while (token.hasMoreElements()) {
			saida.format("%s%n", token.nextElement());
		}
		saida.close();
	}

	private void abrirArquivo(File file) throws FileNotFoundException {
		String texto = "";
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			texto += scan.nextLine() + "\n";
		}
		areaTexto.setText(texto);
		scan.close();
	}

}
