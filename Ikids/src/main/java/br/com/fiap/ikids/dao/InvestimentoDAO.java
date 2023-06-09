package br.com.fiap.ikids.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Endereco;
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
		
		stmt.execute();
		stmt.close();
	}
	
	public List<Investimento> listaPorIdCliente(String idCliente) {
		List<Investimento> clientes = new ArrayList<>();
		String sql = "select select e.* from t_cliente c " + "left join t_invest e "
				+ "on c.id_cliente = e.t_cliente_id_cliente " + "where c.id_cliente = ?";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, idCliente);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return clientes;

	}
}
