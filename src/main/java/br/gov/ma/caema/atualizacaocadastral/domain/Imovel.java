package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ReflectionDiffBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.Data;

@Data
@Entity
public class Imovel implements Diffable<Imovel> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private Roteirizacao roteirizacao;

	@Embedded
	private Endereco endereco;

	@Embedded
	private Cliente cliente;

	@Embedded
	private Subcategorias subcategorias;

	@Embedded
	private Caracteristicas caracteristicas;

	@Embedded
	private Conclusao conclusao;

	@Embedded
	private Hidrometro hidrometro;

	@Embedded
	private Coordenadas coordenadas = new Coordenadas();

	private String observacao;

	@Override
	public DiffResult diff(Imovel obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}

}
