package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.FonteAbastecimento;

public interface FonteAbastecimentoRepo extends JpaRepository<FonteAbastecimento, Long> {

}
