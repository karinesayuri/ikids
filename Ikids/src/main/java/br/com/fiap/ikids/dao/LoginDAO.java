package br.com.fiap.ikids.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Login;

public class LoginDAO {

	private Connection conexao;

	public LoginDAO() {
		this.conexao = new ConnectionFactory().conect();
	}

	public void insert(Login login)throws SQLException {
		String sql = "insert into t_login(id_usuario, ds_login, ds_senha) values (?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, login.getUsuario());
		stmt.setString(2, login.getLogin());
		stmt.setString(3, login.getSenha());
		
		stmt.execute();
		stmt.close();
	}

}
