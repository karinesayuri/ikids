package br.com.fiap.ikids.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Cliente;
import br.com.fiap.ikids.model.Login;

public class LoginDAO {

	private Connection conexao;

	public LoginDAO() {
		this.conexao = new ConnectionFactory().conect();
	}

	public void insert(Login login, Cliente cli)throws SQLException {
		String sql = "insert into t_login(id_usuario, ds_login, ds_senha, T_CLIENTE_ID_CLIENTE) values (?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, login.getUsuario());
		stmt.setString(2, login.getLogin());
		stmt.setString(3, login.getSenha());
		stmt.setString(4, cli.getCliente());
		
		stmt.execute();
		stmt.close();
	}
	
	public boolean logar (String login, String senha) {
		boolean loginEncontrado = false;
		String sql = "select * from t_login where ds_login = ? and ds_senha = ?";
		
		PreparedStatement stmt;
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(2, login);
			stmt.setString(3, senha);
			
			ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            loginEncontrado = true;
	        }
	        
	        rs.close();
	        stmt.close();
	        conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return loginEncontrado;
	}
}
