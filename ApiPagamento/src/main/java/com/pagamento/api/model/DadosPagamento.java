package com.pagamento.api.model;

import java.math.BigDecimal;

public class DadosPagamento {
	
	private String numeroCartao;
	private String nomeImpressoCartao;
	private String codigoCartao;
	private String dataValidadeCartao;
	private BigDecimal valorTotal;
	private Long idCliente;
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeImpressoCartao() {
		return nomeImpressoCartao;
	}
	public void setNomeImpressoCartao(String nomeImpressoCartao) {
		this.nomeImpressoCartao = nomeImpressoCartao;
	}
	public String getCodigoCartao() {
		return codigoCartao;
	}
	public void setCodigoCartao(String codigoCartao) {
		this.codigoCartao = codigoCartao;
	}
	public String getDataValidadeCartao() {
		return dataValidadeCartao;
	}
	public void setDataValidadeCartao(String dataValidadeCartao) {
		this.dataValidadeCartao = dataValidadeCartao;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	
}
