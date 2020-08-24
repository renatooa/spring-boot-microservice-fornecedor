package br.com.renato.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.renato.fornecedor.model.entity.InfoFornecedor;
import br.com.renato.fornecedor.model.repository.InfoFornecedorRepository;

@Service
public class InfoFornecedorService {

	@Autowired
	private InfoFornecedorRepository fornecedorRepository;

	public InfoFornecedor getInfoFornecedorPor(String estado) {
		
		return fornecedorRepository.findByEstado(estado);
	}
}
