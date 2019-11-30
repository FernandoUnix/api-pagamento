package com.pagamento.api.model;

import java.math.BigDecimal;

public class DadosPagamento {
	
	private String numeroCartao;
	private String nomeImpressoCartao;
	private String codigoCartao;
	private String dataValidadeCartao;
	private BigDecimal valorTotal;
	
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getNumero() {
		return numeroCartao;
	}
	public void setNumero(String numero) {
		this.numeroCartao = numero;
	}
	public String getNomeImpressoCartao() {
		return nomeImpressoCartao;
	}
	public void setNomeImpressoCartao(String nomeImpressoCartao) {
		this.nomeImpressoCartao = nomeImpressoCartao;
	}
	public String getCodigo() {
		return codigoCartao;
	}
	public void setCodigo(String codigo) {
		this.codigoCartao = codigo;
	}
	public String getDataValidade() {
		return dataValidadeCartao;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidadeCartao = dataValidade;
	}
	
	
}
