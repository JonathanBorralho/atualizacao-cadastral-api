package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ReflectionDiffBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.Data;

@Data
@Embeddable
public class Roteirizacao implements Diffable<Roteirizacao> {
	private Integer matricula;
	private Integer visita;
	private Integer localidade;
	private Integer setor;
	private Integer quadra;
	private Integer rota;
	private Integer sequencia;
	private Integer sublote;
	private Integer testada;

	@Override
	public DiffResult diff(Roteirizacao obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}
}
