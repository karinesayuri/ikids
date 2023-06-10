package br.com.fiap.ikids.model;

import java.io.Serializable;
import java.sql.Date;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cliente;
	private String nomeCliente;
	private Date dataNascimento;
	private String numeroRg;
	private String numeroCpf;
	private String genero;
	private int telefone;
	public Cliente(String cliente, String nomeCliente, Date dataNascimento, String numeroRg, String numeroCpf,
			String genero, int telefone) {
		super();
		this.cliente = cliente;
		this.nomeCliente = nomeCliente;
		this.dataNascimento = dataNascimento;
		this.numeroRg = numeroRg;
		this.numeroCpf = numeroCpf;
		this.genero = genero;
		this.telefone = telefone;
		
		
	}
	public Cliente() {
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumeroRg() {
		return numeroRg;
	}
	public void setNumeroRg(String numeroRg) {
		this.numeroRg = numeroRg;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	

}
