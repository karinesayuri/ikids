package br.com.fiap.ikids.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Investimento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idInvestimento;
	
	private String tipoInvestimento;
	
	private BigDecimal taxaInvestimento;
	
	private String taxaInvestimentoFormatada;
	
	private Cliente cliente;
	
	public Investimento(String idInvestimento, String tipoInvestimento, BigDecimal taxaInvestimento) {
		super();
		this.idInvestimento = idInvestimento;
		this.tipoInvestimento = tipoInvestimento;
		this.taxaInvestimento = taxaInvestimento;
	}

	public Investimento() {
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public String getIdInvestimento() {
		return idInvestimento;
	}
	
	public String getTaxaInvestimentoFormatada() {
		return taxaInvestimentoFormatada;
	}
	
	public void setTaxaInvestimentoFormatada(String taxaInvestimentoFormatada) {
		this.taxaInvestimentoFormatada = taxaInvestimentoFormatada;
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
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public BigDecimal getTaxaInvestimento() {
		return taxaInvestimento;
	}

	public void setTaxaInvestimento(BigDecimal taxaInvestimento) {
		this.taxaInvestimento = taxaInvestimento;
	}
	
}

	