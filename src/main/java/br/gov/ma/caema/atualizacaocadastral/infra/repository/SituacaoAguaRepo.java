package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.SituacaoAgua;

public interface SituacaoAguaRepo extends JpaRepository<SituacaoAgua, Long> {

}
