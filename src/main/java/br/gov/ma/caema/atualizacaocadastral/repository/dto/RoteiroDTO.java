package br.gov.ma.caema.atualizacaocadastral.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.gov.ma.caema.atualizacaocadastral.domain.Roteiro;
import br.gov.ma.caema.atualizacaocadastral.domain.StatusRoteiro;
import lombok.Data;

@Data
public class RoteiroDTO {
	private final Long id;
	
	@JsonProperty("usuario_id")
	private final Long usuarioId;
	
	@JsonProperty("cadastrante_id")
	private final Long cadastranteId;
	
	private final StatusRoteiro status;
	private final Integer rota;
	private final Integer localidade;

	public static RoteiroDTO fromRoteiro(Roteiro roteiro) {
		return new RoteiroDTO(
			roteiro.getId(), 
			roteiro.getCreatedBy().getId(), 
			roteiro.getCadastrante().getId(),
			roteiro.getStatus(),
			roteiro.getRota(),
			roteiro.getLocalidade()
		);
	}
}
