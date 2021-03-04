package br.gov.ma.caema.atualizacaocadastral.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.infra.TipoCliente;

public interface TipoClienteRepo extends JpaRepository<TipoCliente, Long> {

}
