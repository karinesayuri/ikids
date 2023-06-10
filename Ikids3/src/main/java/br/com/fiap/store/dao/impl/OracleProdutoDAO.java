package br.com.fiap.store.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.store.bean.Produto;
import br.com.fiap.store.dao.ProdutoDAO;
import br.com.fiap.store.exception.DBException;
import br.com.fiap.store.singleton.ConnectionManager;

public class OracleProdutoDAO implements ProdutoDAO{
	private Connection conexao;
	@Override
	public void cadastrar (Produto produto)throws DBException;
	PreparedStatement stmt = null;
	
	try {
		conexao = ConnectionManager.getInstance().
				getConnection();
		String sql = "INSERT INTO TB_PRODUTO (CD_PRODUTO,"
				+ "NM_PRODUTO, QT_PRODUTO, VL_PRODUTO,"
				+ "DT_FABRICACAO) VALUES (SQ_TB_PRODUTO."
	}

}
