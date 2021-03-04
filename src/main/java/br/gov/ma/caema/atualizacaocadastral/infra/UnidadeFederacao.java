package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "unidade_federacao")
public class UnidadeFederacao implements Serializable {
	
	private static final long serialVersionUID = -3180402007176022704L;

	@Id
	@Column(name = "unfe_id")
	private Long id;
	
	@Column(name = "unfe_dsufsigla")
	private String sigla;
	
	@Column(name = "unfe_dsuf")
	private String descricao;
}
