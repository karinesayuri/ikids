package br.com.fiap.ikids.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Endereco;

public class EnderecoDAO {
	private Connection conexao;

	{
		this.conexao = new ConnectionFactory().conect();

	}

	public void insert(Endereco endereco) throws SQLException {
		String sql = "insert into t_endereco(id_end, ds_endereco, ds_cidade, ds_estado, ds_bairro) values(?, ?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setString(1, endereco.getIdEnd());
		stmt.setString(2, endereco.getDsEndereco());
		stmt.setString(3, endereco.getDsCidade());
		stmt.setString(4, endereco.getDsEstado());
		stmt.setString(5, endereco.getDsBairro());

		stmt.execute();
		stmt.close();
	}

	public List<Endereco> listaPorIdCliente(String idCliente) {
		List<Endereco> clientes = new ArrayList<>();
		String sql = "select select e.* from t_cliente c " + "left join t_endereco e "
				+ "on c.id_cliente = e.t_cliente_id_cliente " + "where c.id_cliente = ?";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, idCliente);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return clientes;

	}

	public void delete(String id_end) {
		String sql = "delete from t_endereco " + "where id_end = ?";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, id_end);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Endereco alteracao(Endereco endereco) {
		String sql = "update t_endereco " + "set ds_bairro = ?, " + "ds_cidade = ?, " + "ds_estado = ?, "
				+ "ds_cep = ? " + "where id_end = ? ";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, endereco.getDsBairro());
			stmt.setString(2, endereco.getDsCidade());
			stmt.setString(3, endereco.getDsEstado());
			stmt.setString(4, endereco.getDsCep());
			stmt.setString(5, endereco.getIdEnd());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return endereco;

	}

}
