package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ReflectionDiffBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.Data;

@Data
@Entity
@Table(name = "pavimento_rua")
public class TipoPavimentoRua implements Serializable, Diffable<TipoPavimentoRua> {

	private static final long serialVersionUID = 6345831947125697597L;

	@Id
	@Column(name = "prua_id")
	private Long id;

	@Column(name = "prua_dspavimentorua")
	private String descricao;

	@Override
	public DiffResult diff(TipoPavimentoRua obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}
}
