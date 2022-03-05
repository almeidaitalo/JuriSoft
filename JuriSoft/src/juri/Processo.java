package juri;

import java.io.Serializable;

public class Processo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int numeroCadastro;
	private String foro;
	private String advogado;
	private String cliente;

	public Processo() {
		numeroCadastro = 1;
	}

	public Processo(String foro, String advogado, String cliente) {
		super();
		this.foro = foro;
		this.advogado = advogado;
		this.cliente = cliente;
	}

	public int getNumeroCadastro() {
		return numeroCadastro;
	}

	public void setNumeroCadastro(int numeroCadastro) {
		this.numeroCadastro = numeroCadastro;
	}

	public String getForo() {
		return foro;
	}

	public void setForo(String foro) {
		this.foro = foro;
	}

	public String getAdvogado() {
		return advogado;
	}

	public void setAdvogado(String advogado) {
		this.advogado = advogado;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return getNumeroCadastro() + " " + getForo() + " " + getAdvogado() + " " + getCliente();

	}

}
