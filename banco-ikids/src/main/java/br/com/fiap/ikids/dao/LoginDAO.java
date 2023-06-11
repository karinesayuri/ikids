package br.com.fiap.ikids.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import br.com.fiap.ikids.factory.ConnectionFactory;
import br.com.fiap.ikids.model.Cliente;
import br.com.fiap.ikids.model.Conta;
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
	
	public Login logar (String login, String senha) {
		String sql = "select * from t_login l "
				+ "inner join t_cliente c "
				+ "on l.T_CLIENTE_ID_CLIENTE = c.id_cliente "
				+ "inner join t_conta co "
				+ "on c.id_cliente = co.T_CLIENTE_ID_CLIENTE "
				+ " where ds_login = ? and ds_senha = ?";
		
		Login loginEncontrado = null;
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, senha);
			
			ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	        	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        	loginEncontrado = new Login();
                loginEncontrado.setLogin(rs.getString("ds_login"));
                loginEncontrado.setSenha(rs.getString("ds_senha"));
                loginEncontrado.setCliente(new Cliente());
                loginEncontrado.getCliente().setCliente(rs.getString("id_cliente"));
                loginEncontrado.getCliente().setDataNacimentoFormatada(dateFormat.format(rs.getDate("dt_nascimento")));
                loginEncontrado.getCliente().setGenero(rs.getString("ds_genero"));
                loginEncontrado.getCliente().setNomeCliente(rs.getString("nm_cliente"));
                loginEncontrado.getCliente().setNumeroCpf(rs.getString("nr_cpf"));
                loginEncontrado.getCliente().setNumeroRg(rs.getString("nr_rg"));
                loginEncontrado.getCliente().setTelefone(rs.getInt("nr_telefone"));
                loginEncontrado.setConta(new Conta());
                loginEncontrado.getConta().setValorSaldo(rs.getDouble(("vl_saldo")));
	        }
	        
	        rs.close();
	        stmt.close();
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	    return loginEncontrado;
	}
}
