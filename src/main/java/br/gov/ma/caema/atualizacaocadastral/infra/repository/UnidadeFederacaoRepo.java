package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.UnidadeFederacao;

public interface UnidadeFederacaoRepo extends JpaRepository<UnidadeFederacao, Long> {

}
