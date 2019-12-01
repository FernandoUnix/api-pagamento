package com.pagamento.api.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pagamento.api.model.DadosPagamento;
import com.pagamento.api.model.Pagamento;
import com.pagamento.api.service.PagamentoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "pagamento")
public class PagamentoResource {

	@Autowired
	private PagamentoService pagamentoService;

	@ApiOperation(value = "Obter todos pagamentos")
	@GetMapping("/api/pagamento/consulta")
	public List<Pagamento> getAllPagamentos() {
		return pagamentoService.getAll();
	}

	@ApiOperation(value = "Obter todos pagamentos de um cliente")
	@GetMapping("/api/pagamento/consulta/cliente/{idCliente}")
	public List<Pagamento> getAllPagamentosByIdCliente(@PathVariable("idCliente") Long idCliente) {
		return pagamentoService.getAllBydIdCliente(idCliente);
	}

	@ApiOperation(value = "Realizar pagamento para um cliente")
	@PostMapping("/api/pagamento/pagar")
	public ResponseEntity<Pagamento> realizarPagamento(@RequestBody DadosPagamento dadosPagamento) {

		Pagamento pag = pagamentoService.realizarPagamento(dadosPagamento);
		return ResponseEntity.ok(pag);
	}
}
