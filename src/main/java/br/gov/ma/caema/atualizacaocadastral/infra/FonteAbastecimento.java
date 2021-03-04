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
@Table(name = "fonte_abastecimento")
public class FonteAbastecimento implements Serializable, Diffable<FonteAbastecimento> {
	
	private static final long serialVersionUID = 606347439161841102L;

	@Id
	@Column(name = "ftab_id")
	private Long id;
	
	@Column(name = "ftab_dsfonteabastecimento")
	private String descricao;

	@Override
	public DiffResult diff(FonteAbastecimento obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}
}
