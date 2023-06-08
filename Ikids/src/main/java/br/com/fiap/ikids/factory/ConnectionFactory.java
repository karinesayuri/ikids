package br.com.fiap.ikids.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private final String ORACLE = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";

	public Connection conect() {

		try {
			return DriverManager.getConnection(ORACLE, "rm97484", "");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar");
			e.printStackTrace();
			throw new RuntimeException(e);

		}
	}

}
