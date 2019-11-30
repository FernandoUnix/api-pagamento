package com.pagamento.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pagamento.api.model.Pagamento;

public interface IPagamentoRepository extends JpaRepository<Pagamento, Long> {

}