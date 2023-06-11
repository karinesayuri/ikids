package br.com.fiap.ikids.model;

import java.io.Serializable;
import java.util.List;

public class Login implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String login;
	private String senha;
	private Cliente cliente;
	private Conta conta;
	private List<Investimento> investimento;
	
	public Login(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	
	public List<Investimento> getInvestimento() {
		return investimento;
	}
	
	public void setInvestimento(List<Investimento> investimento) {
		this.investimento = investimento;
	}
	
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Login() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
