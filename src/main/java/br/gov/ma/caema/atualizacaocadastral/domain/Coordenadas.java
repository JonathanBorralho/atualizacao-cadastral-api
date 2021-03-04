package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ReflectionDiffBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.Data;

@Data
@Embeddable
public class Coordenadas implements Diffable<Coordenadas> {
	private Double latitude;
	private Double longitude;

	@Override
	public DiffResult diff(Coordenadas obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}

}
