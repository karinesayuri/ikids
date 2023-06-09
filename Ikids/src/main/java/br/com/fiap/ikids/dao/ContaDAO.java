package br.com.fiap.ikids.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Conta;

public class ContaDAO {
	
	private Connection conexao;
	
	public ContaDAO() {
		this.conexao = new ConnectionFactory().conect();
	}
	
	public void insert(Conta conta)throws SQLException{
		String sql = "insert into t_conta(id_conta, nr_conta, nr_agencia, vl_saldo, da_abertura) values (?, ?, ?, ?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, conta.getIdConta());
		stmt.setString(2, conta.getNumeroAgencia());
		stmt.setString(3, conta.getNumeroConta());
		stmt.setDouble(4, conta.getValorSaldo());
		stmt.setDate(5, conta.getDataAbertura());
		
		stmt.execute();
		stmt.close();
		
	}
}
