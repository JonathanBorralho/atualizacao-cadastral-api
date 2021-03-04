package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ReflectionDiffBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.Data;

@Data
@Embeddable
public class Endereco implements Diffable<Endereco> {
	private String logradouro;
	private String cep;
	private String bairro;
	private String numero;
	private String complemento;

	@Override
	public DiffResult diff(Endereco obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}
}
