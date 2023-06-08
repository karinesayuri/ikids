package br.com.fiap.ikids.dao;

import java.sql.Connection;

import br.com.fiap.ikids.factory.ConnectionFactory;

public class LoginDAO {
	
	private Connection conexao;
	
	public LoginDAO() {
		this.conexao = new ConnectionFactory().conect();
	}

}
