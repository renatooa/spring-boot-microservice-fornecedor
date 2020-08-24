package br.com.renato.fornecedor.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.renato.fornecedor.model.entity.InfoFornecedor;
import br.com.renato.fornecedor.service.InfoFornecedorService;

@RestController
@RequestMapping("/info")
public class InfoFornecedorController {

	private static final Logger LOG = LoggerFactory.getLogger(InfoFornecedorController.class);

	@Autowired
	private InfoFornecedorService infoService;

	@GetMapping("/{estado}")
	public InfoFornecedor getInfoFornecedorPor(@PathVariable String estado) {
		LOG.info("informacoes de estado {}", estado);
		return infoService.getInfoFornecedorPor(estado);
	}
}
