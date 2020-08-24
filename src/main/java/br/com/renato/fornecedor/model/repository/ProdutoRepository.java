package br.com.renato.fornecedor.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.renato.fornecedor.model.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {

	public List<Produto> findByEstado(String estado);

	public List<Produto> findByIdIn(List<Long> ids);
}
