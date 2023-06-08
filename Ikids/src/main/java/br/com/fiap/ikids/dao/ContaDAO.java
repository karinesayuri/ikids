package br.com.fiap.ikids.dao;

import java.sql.Connection;

import br.com.fiap.ikids.factory.ConnectionFactory;

public class ContaDAO {
	
	private Connection conexao;
	
	public ContaDAO() {
		this.conexao = new ConnectionFactory().conect();
	}
}
