package br.com.fiap.ikids.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Investimento;

public class InvestimentoDAO {
	
private Connection conexao;
	
	public InvestimentoDAO() {
		this.conexao = new ConnectionFactory().conect();
	}
	
	public void insert(Investimento investimento) throws SQLException{
		String sql = "insert into t_investimento(id_invest, tp_invest, tx_rendimento) values (?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, investimento.getIdInvestimento());
		stmt.setString(2, investimento.getTipoInvestimento());
		stmt.setBigDecimal(3, investimento.getTavaInvestimento());
		
		
	}
}
