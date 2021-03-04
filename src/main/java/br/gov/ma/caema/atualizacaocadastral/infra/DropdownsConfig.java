package br.gov.ma.caema.atualizacaocadastral.infra;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DropdownsConfig {
	
	@JsonProperty("tipo_abastecimento")
	private List<FonteAbastecimento> tipoAbastecimento;
	
	@JsonProperty("tipo_sit_agua")
	private List<SituacaoAgua> tipoSitAgua;
	
	@JsonProperty("tipo_sit_esgoto")
	private List<SituacaoEsgoto> tipoSitEsgoto;
	
	@JsonProperty("tipo_cliente")
	private List<TipoCliente> tipoCliente;
	
	@JsonProperty("tipo_cobertura")
	private List<TipoCobertura> tipoCobertura;
	
	@JsonProperty("tipo_construcao")
	private List<TipoConstrucao> tipoConstrucao;
	
	@JsonProperty("tipo_habitacao")
	private List<TipoHabitacao> tipoHabitacao;
	
	@JsonProperty("tipo_calcada")
	private List<TipoPavimentoCalcada> tipoCalcada;
	
	@JsonProperty("tipo_rua")
	private List<TipoPavimentoRua> tipoRua;
	
	@JsonProperty("tipo_propriedade")
	private List<TipoPropriedade> tipoPropriedade;
	
	@JsonProperty("estados")
	private List<UnidadeFederacao> estados;
	
	@JsonProperty("tipo_impedimento")
	private List<TipoImpedimento> tipoImpedimento;
}
