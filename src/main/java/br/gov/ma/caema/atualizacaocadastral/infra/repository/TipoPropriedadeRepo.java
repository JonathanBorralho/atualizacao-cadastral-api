package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.TipoPropriedade;

public interface TipoPropriedadeRepo extends JpaRepository<TipoPropriedade, Long> {

}
