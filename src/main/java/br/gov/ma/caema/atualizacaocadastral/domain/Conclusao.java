package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ReflectionDiffBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Embeddable
public class Conclusao implements Diffable<Conclusao> {

	@JsonProperty("pt_agua")
	@Column(name = "pt_agua")
	private Long ptAgua;

	private Long moradores;

	@Override
	public DiffResult diff(Conclusao obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}

}
