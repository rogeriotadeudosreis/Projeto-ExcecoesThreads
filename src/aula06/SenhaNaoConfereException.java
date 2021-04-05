package aula06;

public class SenhaNaoConfereException extends Exception {

	private static final long serialVersionUID = 1L;

	public SenhaNaoConfereException(String mensagem) {
		super(mensagem);
	}

}
