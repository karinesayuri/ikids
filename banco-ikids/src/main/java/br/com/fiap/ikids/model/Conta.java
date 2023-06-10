package br.com.fiap.ikids.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Conta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idConta;
	private String numeroConta;
	private String numeroAgencia;
	private Double valorSaldo;
	private Date dataAbertura;
	
	public Conta(String idConta, String numeroConta, String numeroAgencia, Double valorSaldo, Date dataAbertura) {
		super();
		this.idConta = idConta;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.valorSaldo = valorSaldo;
		this.dataAbertura = dataAbertura;
	}

	public String getIdConta() {
		return idConta;
	}

	public void setIdConta(String idConta) {
		this.idConta = idConta;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public Double getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(Double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
}
	
	
	
	