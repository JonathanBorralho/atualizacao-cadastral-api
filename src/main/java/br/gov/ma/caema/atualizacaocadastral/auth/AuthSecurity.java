package br.gov.ma.caema.atualizacaocadastral.auth;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

@Component
public class AuthSecurity {
	
	public Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}
	
	public String getMatriculaUsuario() {
		final Jwt jwt = (Jwt) getAuthentication().getPrincipal();
		return jwt.getClaimAsString("user_name");
	}
}
