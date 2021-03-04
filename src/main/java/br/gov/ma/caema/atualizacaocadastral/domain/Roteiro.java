package br.gov.ma.caema.atualizacaocadastral.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Roteiro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@CreationTimestamp
	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario createdBy;

	@ManyToOne
	@JoinColumn(name = "cadastrante_id", nullable = false)
	private Usuario cadastrante;

	@Enumerated(EnumType.STRING)
	private StatusRoteiro status;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "roteiro_imovel", inverseJoinColumns = @JoinColumn(name = "imovel_id"))
	private List<Imovel> imoveis;
	
	private Integer rota;
	private Integer localidade;
}
