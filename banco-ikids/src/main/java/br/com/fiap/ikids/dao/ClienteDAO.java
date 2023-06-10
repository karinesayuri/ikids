package br.com.fiap.ikids.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Cliente;

public class ClienteDAO {

	private Connection conexao;

	public ClienteDAO() {
		this.conexao = new ConnectionFactory().conect();
	}

	public Cliente insert(Cliente cliente)throws SQLException {
		String sql = "insert into t_cliente(id_cliente, nm_cliente, dt_nascimento, nr_rg, nr_cpf, ds_genero, nr_telefone) values (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, cliente.getCliente());
		stmt.setString(2, cliente.getNomeCliente());
		stmt.setDate(3, cliente.getDataNascimento());
		stmt.setString(4, cliente.getNumeroRg());
		stmt.setString(5, cliente.getNumeroCpf());
		stmt.setString(6, cliente.getGenero());
		stmt.setInt(7, cliente.getTelefone());
		
		int linhasAfetadas = stmt.executeUpdate();
		
		if (linhasAfetadas > 0) {
            return cliente;
        }
		return cliente;
		
	}

}
