package br.com.renato.fornecedor.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.renato.fornecedor.model.entity.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
