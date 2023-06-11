package br.com.fiap.ikids.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Cliente;
import br.com.fiap.ikids.model.Conta;
import br.com.fiap.ikids.model.Endereco;

public class ContaDAO {

	private Connection conexao;

	public ContaDAO() {
		this.conexao = new ConnectionFactory().conect();
	}

	public void insert(Conta conta, Cliente cli) throws SQLException {
		String sql = "insert into t_conta(id_conta, nr_agencia, nr_conta, vl_saldo, dt_abertura, T_CLIENTE_ID_CLIENTE) values (?, ?, ?, ?,?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, conta.getIdConta());
		stmt.setString(2, conta.getNumeroAgencia());
		stmt.setString(3, conta.getNumeroConta());
		stmt.setDouble(4, conta.getValorSaldo());
		stmt.setDate(5, new java.sql.Date(conta.getDataAbertura().getTime()));
		stmt.setString(6, cli.getCliente());

		stmt.execute();
		stmt.close();

	}

	public List<Conta> listaPorIdCliente(String idCliente) {
		List<Conta> clientes = new ArrayList<>();
		String sql = "select select e.* from t_cliente c " + "left join t_conta e "
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
