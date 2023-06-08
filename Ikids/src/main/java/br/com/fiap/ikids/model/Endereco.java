package br.com.fiap.ikids.model;

import java.io.Serializable;
import java.util.Calendar;

public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String IdEnd;
	private String dsEndereco;
	private String dsCidade;
	private String dsEstado;
	private String dsBairro;
	
	public Endereco(String idEnd, String dsEndereco, String dsCidade, String dsEstado, String dsBairro) {
		super();
		IdEnd = idEnd;
		this.dsEndereco = dsEndereco;
		this.dsCidade = dsCidade;
		this.dsEstado = dsEstado;
		this.dsBairro = dsBairro;
	}

	public String getIdEnd() {
		return IdEnd;
	}

	public void setIdEnd(String idEnd) {
		IdEnd = idEnd;
	}

	public String getDsEndereco() {
		return dsEndereco;
	}

	public void setDsEndereco(String dsEndereco) {
		this.dsEndereco = dsEndereco;
	}

	public String getDsCidade() {
		return dsCidade;
	}

	public void setDsCidade(String dsCidade) {
		this.dsCidade = dsCidade;
	}

	public String getDsEstado() {
		return dsEstado;
	}

	public void setDsEstado(String dsEstado) {
		this.dsEstado = dsEstado;
	}

	public String getDsBairro() {
		return dsBairro;
	}

	public void setDsBairro(String dsBairro) {
		this.dsBairro = dsBairro;
	}
	
	
	
	
	
}
