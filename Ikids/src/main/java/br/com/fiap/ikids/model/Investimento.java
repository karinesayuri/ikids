package br.com.fiap.ikids.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Investimento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idInvestimento;
	
	private String tipoInvestimento;
	
	private BigDecimal tavaInvestimento;
	
	public Investimento(int idInvestimento, String tipoInvestimento, BigDecimal tavaInvestimento) {
		super();
		this.idInvestimento = idInvestimento;
		this.tipoInvestimento = tipoInvestimento;
		this.tavaInvestimento = tavaInvestimento;
	}

	public int getIdInvestimento() {
		return idInvestimento;
	}

	public void setIdInvestimento(int idInvestimento) {
		this.idInvestimento = idInvestimento;
	}

	public String getTipoInvestimento() {
		return tipoInvestimento;
	}

	public void setTipoInvestimento(String tipoInvestimento) {
		this.tipoInvestimento = tipoInvestimento;
	}

	public BigDecimal getTavaInvestimento() {
		return tavaInvestimento;
	}

	public void setTavaInvestimento(BigDecimal tavaInvestimento) {
		this.tavaInvestimento = tavaInvestimento;
	}
	
}
