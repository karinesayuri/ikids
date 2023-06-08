package br.com.fiap.ikids.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Investimento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idInvestimento;
	
	private String tipoInvestimento;
	
	private BigDecimal taxaInvestimento;
	
	public Investimento(String idInvestimento, String tipoInvestimento, BigDecimal taxaInvestimento) {
		super();
		this.idInvestimento = idInvestimento;
		this.tipoInvestimento = tipoInvestimento;
		this.taxaInvestimento = taxaInvestimento;
	}

	public String getIdInvestimento() {
		return idInvestimento;
	}

	public void setIdInvestimento(String idInvestimento) {
		this.idInvestimento = idInvestimento;
	}

	public String getTipoInvestimento() {
		return tipoInvestimento;
	}

	public void setTipoInvestimento(String tipoInvestimento) {
		this.tipoInvestimento = tipoInvestimento;
	}

	public BigDecimal getTavaInvestimento() {
		return taxaInvestimento;
	}

	public void setTavaInvestimento(BigDecimal tavaInvestimento) {
		this.taxaInvestimento = tavaInvestimento;
	}

	
}

	