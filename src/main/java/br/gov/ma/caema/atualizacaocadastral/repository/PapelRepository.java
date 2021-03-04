package br.gov.ma.caema.atualizacaocadastral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.domain.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long> {

}
