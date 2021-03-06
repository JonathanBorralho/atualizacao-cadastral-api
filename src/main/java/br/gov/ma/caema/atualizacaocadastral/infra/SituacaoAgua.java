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
@Table(name = "ligacao_agua_situacao")
public class SituacaoAgua implements Serializable, Diffable<SituacaoAgua> {
	
	private static final long serialVersionUID = -3729483973023733245L;

	@Id
	@Column(name = "last_id")
	private Long id;
	
	@Column(name = "last_dsligacaoaguasituacao")
	private String descricao;

	@Override
	public DiffResult diff(SituacaoAgua obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}
}
