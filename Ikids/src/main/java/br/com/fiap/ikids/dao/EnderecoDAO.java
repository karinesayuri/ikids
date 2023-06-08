package br.com.fiap.ikids.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Endereco;

public class EnderecoDAO {
	private Connection conexao;
	
	{
		this.conexao = new ConnectionFactory().conect();

	}

	public void insert(Endereco endereco) throws SQLException {
		String sql = "insert into t_endereco(id_end, ds_endereco, ds_cidade, ds_estado, ds_bairro)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		//stmt.SetString(1, endereco.g)
		
		
	}
}
