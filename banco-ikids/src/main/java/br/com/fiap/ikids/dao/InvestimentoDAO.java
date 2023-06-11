package br.com.fiap.ikids.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Investimento;

public class InvestimentoDAO {
	
private Connection conexao;
	
	public InvestimentoDAO() {
		this.conexao = new ConnectionFactory().conect();
	}
	
	public void insert(Investimento investimento) throws SQLException{
		String sql = "insert into t_invest(id_invest, tp_invest, tx_rendimento, T_CLIENTE_ID_CLIENTE) values (?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, investimento.getIdInvestimento());
		stmt.setString(2, investimento.getTipoInvestimento());
		stmt.setBigDecimal(3, investimento.getTaxaInvestimento());
		stmt.setString(4, investimento.getCliente().getCliente());
		
		stmt.execute();
		stmt.close();
	}
	
	public List<Investimento> listaPorIdCliente(String idCliente) {
		List<Investimento> investimentos = new ArrayList<>();
		String sql = "select * from t_invest "
				+ "where T_CLIENTE_ID_CLIENTE = ?";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, idCliente);
			
			ResultSet rs = stmt.executeQuery();
	        
	        while (rs.next()) {
	            Investimento investimento = new Investimento();

	            investimento.setIdInvestimento((rs.getString("id_invest")));
	            investimento.setTipoInvestimento(rs.getString("tp_invest"));
	            investimento.setTaxaInvestimentoFormatada((rs.getString("tx_rendimento")));
	            
	            investimentos.add(investimento);
	        }

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return investimentos;

	}
}
