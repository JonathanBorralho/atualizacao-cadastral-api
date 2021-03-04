package br.gov.ma.caema.atualizacaocadastral.infra;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cliente_tipo")
public class TipoCliente implements Serializable {
	
	private static final long serialVersionUID = 1260091779932983104L;

	@Id
	@Column(name = "cltp_id")
	private Long id;
	
	@Column(name = "cltp_dsclientetipo")
	private String descricao;
}
