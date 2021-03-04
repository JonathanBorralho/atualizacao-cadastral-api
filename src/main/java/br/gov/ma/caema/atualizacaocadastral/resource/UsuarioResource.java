package br.gov.ma.caema.atualizacaocadastral.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ma.caema.atualizacaocadastral.domain.Usuario;
import br.gov.ma.caema.atualizacaocadastral.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}

}
