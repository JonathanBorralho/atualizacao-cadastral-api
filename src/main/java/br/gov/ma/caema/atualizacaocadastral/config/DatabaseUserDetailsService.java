package br.gov.ma.caema.atualizacaocadastral.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.ma.caema.atualizacaocadastral.auth.AuthUser;
import br.gov.ma.caema.atualizacaocadastral.domain.Usuario;
import br.gov.ma.caema.atualizacaocadastral.repository.UsuarioRepository;

@Transactional
@Service
public class DatabaseUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepo;

	@Override
	public UserDetails loadUserByUsername(String matricula) throws UsernameNotFoundException {
		Usuario user = usuarioRepo.findByMatricula(matricula)
				.orElseThrow(() -> new UsernameNotFoundException("Matrícula e/ou senha inválidas"));

		return new AuthUser(user);
	}

}
