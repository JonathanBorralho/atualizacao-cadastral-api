package br.gov.ma.caema.atualizacaocadastral.resource.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.gov.ma.caema.atualizacaocadastral.domain.Roteiro;
import br.gov.ma.caema.atualizacaocadastral.domain.StatusRoteiro;
import br.gov.ma.caema.atualizacaocadastral.domain.Usuario;
import lombok.Data;

@Data
public class RoteiroResumo {

	private Long id;
	private Usuario usuario;
	private Usuario cadastrante;
	private StatusRoteiro status;
	
	@JsonProperty("criado_em")
	private LocalDateTime criadoEm;

	public RoteiroResumo(Long id, Usuario usuario, Usuario cadastrante, LocalDateTime criadoEm, StatusRoteiro status) {
		this.id = id;
		this.usuario = usuario;
		this.cadastrante = cadastrante;
		this.criadoEm = criadoEm;
		this.status = status;
	}

	public static RoteiroResumo fromRoteiro(Roteiro roteiro) {
		return new RoteiroResumo(
			roteiro.getId(),
			roteiro.getCreatedBy(),
			roteiro.getCadastrante(),
			roteiro.getCreatedAt(),
			roteiro.getStatus()
		);
	}

}
