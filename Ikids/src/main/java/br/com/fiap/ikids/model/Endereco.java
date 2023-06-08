package br.com.fiap.ikids.model;

import java.io.Serializable;
import java.util.Calendar;

public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idCliente;
	private String nomeCliente;
	private Calendar dataNascimento;
	private String rg;
	private String cpf;
	private String genero;
	private String telefone;
	
	
	
	public Endereco(int idCliente, String nomeCliente, Calendar dataNascimento, String rg, String cpf, String genero,
			String telefone) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.genero = genero;
		this.telefone = telefone;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
