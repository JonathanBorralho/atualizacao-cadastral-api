package br.gov.ma.caema.atualizacaocadastral.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String matricula;
	private String nome;
	
	@JsonIgnore
	private String senha;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "usuario_papel", inverseJoinColumns = @JoinColumn(name = "papel_id"))
	private List<Papel> papeis;

}
