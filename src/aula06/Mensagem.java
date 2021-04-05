package aula06;

import java.io.Serializable;

public class Mensagem implements Serializable {

	private String remetente;
	private String descricao;
	
	public Mensagem (String remetente, String descricao) {
		this.remetente = remetente;
		this.descricao = descricao;
	}

	public String toString() {
		return String.format("%s: %s", remetente, descricao);
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
