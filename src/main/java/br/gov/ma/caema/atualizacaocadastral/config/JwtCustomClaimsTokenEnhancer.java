package br.gov.ma.caema.atualizacaocadastral.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import br.gov.ma.caema.atualizacaocadastral.auth.AuthUser;

public class JwtCustomClaimsTokenEnhancer implements TokenEnhancer {

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		if (authentication.getPrincipal() instanceof AuthUser) {
			AuthUser user = (AuthUser) authentication.getPrincipal();
			
			final Map<String, Object> info = new HashMap<>();
			info.put("user_id", user.getUserId());
			info.put("full_name", user.getFullName());
			
			DefaultOAuth2AccessToken oAuth2AccessToken = (DefaultOAuth2AccessToken) accessToken;
			oAuth2AccessToken.setAdditionalInformation(info);
		}

		return accessToken;
	}

}
