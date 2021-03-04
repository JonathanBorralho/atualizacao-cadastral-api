package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.SituacaoEsgoto;

public interface SituacaoEsgotoRepo extends JpaRepository<SituacaoEsgoto, Long> {

}
