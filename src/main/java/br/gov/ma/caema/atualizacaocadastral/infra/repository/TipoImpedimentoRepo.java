package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.TipoImpedimento;

public interface TipoImpedimentoRepo extends JpaRepository<TipoImpedimento, Long> {

}
