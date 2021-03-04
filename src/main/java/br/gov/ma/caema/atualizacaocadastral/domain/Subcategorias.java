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
public class Subcategorias implements Diffable<Subcategorias> {

	@JsonProperty("cat_1")
	@Column(name = "cat_1")
	private String cat1;

	@JsonProperty("subcat_1")
	@Column(name = "subcat_1")
	private String subcat1;

	@JsonProperty("cat_2")
	@Column(name = "cat_2")
	private String cat2;

	private Integer economias;

	@Override
	public DiffResult diff(Subcategorias obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}

}
