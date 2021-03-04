package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.TipoConstrucao;

public interface TipoConstrucaoRepo extends JpaRepository<TipoConstrucao, Long> {

}
