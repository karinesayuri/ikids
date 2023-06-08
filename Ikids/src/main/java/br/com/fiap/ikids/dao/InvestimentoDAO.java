package br.com.fiap.ikids.dao;

import java.sql.Connection;

import br.com.fiap.ikids.factory.ConnectionFactory;

public class InvestimentoDAO {
	
private Connection conexao;
	
	public InvestimentoDAO() {
		this.conexao = new ConnectionFactory().conect();
	}
}
