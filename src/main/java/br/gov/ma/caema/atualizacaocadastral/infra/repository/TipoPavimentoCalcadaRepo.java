package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.TipoPavimentoCalcada;

public interface TipoPavimentoCalcadaRepo extends JpaRepository<TipoPavimentoCalcada, Long> {

}
