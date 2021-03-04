package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.TipoHabitacao;

public interface TipoHabitacaoRepo extends JpaRepository<TipoHabitacao, Long> {

}
