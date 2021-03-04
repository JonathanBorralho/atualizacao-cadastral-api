package br.gov.ma.caema.atualizacaocadastral.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ma.caema.atualizacaocadastral.auth.AuthSecurity;
import br.gov.ma.caema.atualizacaocadastral.domain.Imovel;
import br.gov.ma.caema.atualizacaocadastral.domain.Roteiro;
import br.gov.ma.caema.atualizacaocadastral.repository.RoteiroRepository;
import br.gov.ma.caema.atualizacaocadastral.resource.response.RoteiroResumo;
import br.gov.ma.caema.atualizacaocadastral.service.RoteiroService;

@RestController
@RequestMapping("/roteiros")
public class RoteiroResource {

	@Autowired
	private RoteiroRepository roteiroRepository;

	@Autowired
	private RoteiroService roteiroService;
	
	@Autowired
	private AuthSecurity authSecurity;

	@GetMapping
	public List<RoteiroResumo> listar() {
		final String matricula = authSecurity.getMatriculaUsuario();
		return roteiroRepository
				.findByCadastranteMatricula(matricula)
				.stream()
				.map(RoteiroResumo::fromRoteiro)
				.collect(Collectors.toList());
	}

	@GetMapping("/{id}/imoveis")
	public List<Imovel> listarImoveisPorId(@PathVariable Long id) {
		final Roteiro roteiro = roteiroService.buscarOuFalhar(id);
		return roteiro.getImoveis();
	}
}
