package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.TipoPavimentoRua;

public interface TipoPavimentoRuaRepo extends JpaRepository<TipoPavimentoRua, Long> {

}
