package br.gov.ma.caema.atualizacaocadastral.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "roteiro_upload")
public class RoteiroUpload {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@CreationTimestamp
	@Column(name = "data_envio")
	private LocalDateTime dataEnvio;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roteiro_id")
	private Roteiro roteiro;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "roteiro_upload_imovel", inverseJoinColumns = @JoinColumn(name = "imovel_atualizacao_id"))
	private List<ImovelAtualizacao> imoveis;
}
