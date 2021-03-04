package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ReflectionDiffBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.gov.ma.caema.atualizacaocadastral.infra.FonteAbastecimento;
import br.gov.ma.caema.atualizacaocadastral.infra.SituacaoAgua;
import br.gov.ma.caema.atualizacaocadastral.infra.SituacaoEsgoto;
import br.gov.ma.caema.atualizacaocadastral.infra.TipoCobertura;
import br.gov.ma.caema.atualizacaocadastral.infra.TipoConstrucao;
import br.gov.ma.caema.atualizacaocadastral.infra.TipoHabitacao;
import br.gov.ma.caema.atualizacaocadastral.infra.TipoPavimentoCalcada;
import br.gov.ma.caema.atualizacaocadastral.infra.TipoPavimentoRua;
import br.gov.ma.caema.atualizacaocadastral.infra.TipoPropriedade;
import lombok.Data;

@Data
@Embeddable
public class Caracteristicas implements Diffable<Caracteristicas> {

	private Integer area;

	@ManyToOne
	@JoinColumn(name = "tipo_pavimento_calcada_id")
	private TipoPavimentoCalcada calcada;

	@JsonProperty("tipo_rua")
	@ManyToOne
	@JoinColumn(name = "tipo_pavimento_rua_id")
	private TipoPavimentoRua rua;

	@ManyToOne
	@JoinColumn(name = "tipo_abastecimento_id")
	private FonteAbastecimento abastecimento;

	@ManyToOne
	@JoinColumn(name = "ligacao_agua_situacao_id")
	private SituacaoAgua agua;

	@ManyToOne
	@JoinColumn(name = "ligacao_esgoto_situacao_id")
	private SituacaoEsgoto esgoto;

	@ManyToOne
	@JoinColumn(name = "tipo_habitacao_id")
	private TipoHabitacao habitacao;

	@ManyToOne
	@JoinColumn(name = "tipo_propriedade_id")
	private TipoPropriedade propriedade;

	@ManyToOne
	@JoinColumn(name = "tipo_construcao_id")
	private TipoConstrucao construcao;

	@ManyToOne
	@JoinColumn(name = "tipo_cobertura_id")
	private TipoCobertura cobertura;

	@Override
	public DiffResult diff(Caracteristicas obj) {
		return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).build();
	}

}
