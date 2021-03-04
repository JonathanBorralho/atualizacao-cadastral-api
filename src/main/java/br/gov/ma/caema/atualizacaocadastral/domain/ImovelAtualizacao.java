package br.gov.ma.caema.atualizacaocadastral.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.DiffBuilder;
import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ToStringStyle;

import br.gov.ma.caema.atualizacaocadastral.infra.TipoImpedimento;
import lombok.Data;

@Data
@Entity
@Table(name = "imovel_atualizacao")
public class ImovelAtualizacao implements Diffable<Imovel> {

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

	@ManyToOne
	@JoinColumn(name = "tipo_impedimento_id")
	private TipoImpedimento impedimento;

	@Override
	public DiffResult diff(Imovel obj) {
		final DiffBuilder builder = new DiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE);

		// Roteirizacao
		if (roteirizacao == null) {
			roteirizacao = new Roteirizacao();
		}

		if (obj.getRoteirizacao() == null) {
			obj.setRoteirizacao(new Roteirizacao());
		}

		builder.append("roteirizacao", this.roteirizacao.diff(obj.getRoteirizacao()));

		// Endereco
		if (endereco == null) {
			endereco = new Endereco();
		}

		if (obj.getEndereco() == null) {
			obj.setEndereco(new Endereco());
		}

		builder.append("endereco", this.endereco.diff(obj.getEndereco()));

		// Cliente
		if (cliente == null) {
			cliente = new Cliente();
		}

		if (obj.getCliente() == null) {
			obj.setCliente(new Cliente());
		}

		builder.append("cliente", this.cliente.diff(obj.getCliente()));

		// Subcategorias
		if (this.subcategorias == null) {
			this.subcategorias = new Subcategorias();
		}

		if (obj.getSubcategorias() == null) {
			obj.setSubcategorias(new Subcategorias());
		}

		builder.append("subcategorias", this.subcategorias.diff(obj.getSubcategorias()));

		// Caracteristicas
		if (this.caracteristicas == null) {
			this.caracteristicas = new Caracteristicas();
		}

		if (obj.getCaracteristicas() == null) {
			obj.setCaracteristicas(new Caracteristicas());
		}

		builder.append("caracteristicas", this.caracteristicas.diff(obj.getCaracteristicas()));

		// Conclusao
		if (this.conclusao == null) {
			this.conclusao = new Conclusao();
		}

		if (obj.getConclusao() == null) {
			obj.setConclusao(new Conclusao());
		}

		builder.append("conclusao", this.conclusao.diff(obj.getConclusao()));
		
		// Coordenadas
		if (this.coordenadas == null) {
			this.coordenadas = new Coordenadas();
		}

		if (obj.getCoordenadas() == null) {
			obj.setCoordenadas(new Coordenadas());
		}

		builder.append("coordenadas", this.coordenadas.diff(obj.getCoordenadas()));
		
		// Hidrometro
		if (this.hidrometro == null) {
			this.hidrometro = new Hidrometro();
		}

		if (obj.getHidrometro() == null) {
			obj.setHidrometro(new Hidrometro());
		}

		builder.append("hidrometro", this.hidrometro.diff(obj.getHidrometro()));
		
		// Observacao
		builder.append("observacao", this.observacao, obj.getObservacao());

		return builder.build();
	}

}
