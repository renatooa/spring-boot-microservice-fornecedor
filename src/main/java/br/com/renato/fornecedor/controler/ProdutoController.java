package br.com.renato.fornecedor.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.renato.fornecedor.model.entity.Produto;
import br.com.renato.fornecedor.service.ProdutoService;

@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/{estado}")
	public List<Produto> getProdutosPorEstado(@PathVariable("estado") String estado) {
		
		
		return produtoService.getProdutosPorEstado(estado);
	}
}
