package br.com.renato.fornecedor.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.renato.fornecedor.model.entity.InfoFornecedor;

@Repository
public interface InfoFornecedorRepository extends CrudRepository<InfoFornecedor, Long> {

	public InfoFornecedor findByEstado(String estado);

}
