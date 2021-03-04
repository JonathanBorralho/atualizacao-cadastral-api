package br.gov.ma.caema.atualizacaocadastral.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ma.caema.atualizacaocadastral.domain.Papel;
import br.gov.ma.caema.atualizacaocadastral.repository.PapelRepository;

@RestController
@RequestMapping("/papeis")
public class PapelResource {

	@Autowired
	private PapelRepository papelRepository;

	@GetMapping
	public List<Papel> listar() {
		return papelRepository.findAll();
	}
}
