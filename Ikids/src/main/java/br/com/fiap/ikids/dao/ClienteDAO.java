package br.com.fiap.ikids.dao;

import java.sql.Connection;

import br.com.fiap.ikids.factory.ConnectionFactory;

public class ClienteDAO {
	
	private Connection conexao;
	
	public ClienteDAO() {
		this.conexao = new ConnectionFactory().conect();
	}

}
