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
@Table(name = "pavimento_calcada")
public class TipoPavimentoCalcada implements Serializable, Diffable<TipoPavimentoCalcada> {

	private static final long serialVersionUID = -5605547917600514446L;

	@Id
	@Column(name = "pcal_id")
	private Long id;
	
	@Column(name = "pcal_dspavimentocalcada")
	private String descricao;

	@Override
	public DiffResult diff(TipoPavimentoCalcada obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}
}
