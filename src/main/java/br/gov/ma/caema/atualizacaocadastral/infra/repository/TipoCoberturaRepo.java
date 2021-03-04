package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.TipoCobertura;

public interface TipoCoberturaRepo extends JpaRepository<TipoCobertura, Long> {

}
