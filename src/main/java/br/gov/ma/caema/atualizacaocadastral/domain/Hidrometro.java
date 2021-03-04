package br.gov.ma.caema.atualizacaocadastral.domain;

import java.time.LocalDate;

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
public class Hidrometro implements Diffable<Hidrometro> {
	private String hidrometro;
	private Long leitura;

	@JsonProperty("data_leitura")
	@Column(name = "data_leitura")
	private LocalDate dataLeitura;

	@Override
	public DiffResult diff(Hidrometro obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}

}
