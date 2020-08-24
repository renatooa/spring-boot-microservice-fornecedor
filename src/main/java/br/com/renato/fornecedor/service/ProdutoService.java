package br.com.renato.fornecedor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.renato.fornecedor.model.entity.Produto;
import br.com.renato.fornecedor.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;
	
	public List<Produto> getProdutosPorEstado(String estado) {
		return produtoRepository.findByEstado(estado);
	}	
}
