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
@Table(name = "imovel_tipo_construcao")
public class TipoConstrucao implements Serializable, Diffable<TipoConstrucao> {
	
	private static final long serialVersionUID = 228761902304891257L;

	@Id
	@Column(name = "imco_id")
	private Long id;
	
	@Column(name = "imco_dstipoconstrucao")
	private String descricao;

	@Override
	public DiffResult diff(TipoConstrucao obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}
}
