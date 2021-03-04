package br.gov.ma.caema.atualizacaocadastral.auth;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import br.gov.ma.caema.atualizacaocadastral.domain.Usuario;
import lombok.Getter;

@Getter
public class AuthUser extends User {

	private static final long serialVersionUID = 1L;
	
	private Long userId;
	private String fullName;

	public AuthUser(Usuario usuario) {
		super(usuario.getMatricula(), usuario.getSenha(), getAuthorities(usuario));
		
		this.userId = usuario.getId();
		this.fullName = usuario.getNome();
	}
	
	private static Collection<? extends GrantedAuthority> getAuthorities(Usuario user) {
		return user.getPapeis()
				.stream()
				.map(p -> new SimpleGrantedAuthority("ROLE_".concat(p.getNome())))
				.collect(Collectors.toSet());
	}

}
