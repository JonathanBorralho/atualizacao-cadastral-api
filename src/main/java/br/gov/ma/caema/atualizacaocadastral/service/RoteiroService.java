package br.gov.ma.caema.atualizacaocadastral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.ma.caema.atualizacaocadastral.domain.Roteiro;
import br.gov.ma.caema.atualizacaocadastral.exception.EntidadeNaoEncontradaException;
import br.gov.ma.caema.atualizacaocadastral.repository.RoteiroRepository;

@Service
public class RoteiroService {

	@Autowired
	private RoteiroRepository roteiroRepository;

	public Roteiro buscarOuFalhar(Long id) throws EntidadeNaoEncontradaException {
		return roteiroRepository.findById(id)
				.orElseThrow(() -> new EntidadeNaoEncontradaException());
	}
}
