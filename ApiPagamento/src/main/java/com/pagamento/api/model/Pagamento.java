package com.pagamento.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Pagamento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@CreationTimestamp
	private LocalDateTime dataHoraPagamento;

	private BigDecimal valorTotal;
	private Long clienteId;
	private String numeroCartao;
	private String nomeImpressoCartao;
	private String codigoCartao;
	private String dataValidadeCartao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataHoraPagamento() {
		return dataHoraPagamento;
	}

	public void setDataHoraPagamento(LocalDateTime dataHoraPagamento) {
		this.dataHoraPagamento = dataHoraPagamento;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

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
