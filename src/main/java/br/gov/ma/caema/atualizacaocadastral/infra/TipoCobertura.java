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
@Table(name = "imovel_tipo_cobertura")
public class TipoCobertura implements Serializable, Diffable<TipoCobertura> {

	private static final long serialVersionUID = -1529245672634204612L;

	@Id
	@Column(name = "imcb_id")
	private Long id;
	
	@Column(name = "imcb_dstipocobertura")
	private String descricao;

	@Override
	public DiffResult diff(TipoCobertura obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}
}
