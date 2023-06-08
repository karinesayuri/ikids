package br.com.fiap.ikids.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

public class Conta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idConta;
	private String numeroConta;
	private String numeroAgencia;
	private BigDecimal valorSaldo;
	private Calendar dataAbertura;
	
	public Conta(int idConta, String numeroConta, String numeroAgencia, BigDecimal valorSaldo, Calendar dataAbertura) {
		super();
		this.idConta = idConta;
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.valorSaldo = valorSaldo;
		this.dataAbertura = dataAbertura;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
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

	public BigDecimal getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(BigDecimal valorSaldo) {
		this.valorSaldo = valorSaldo;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
}
