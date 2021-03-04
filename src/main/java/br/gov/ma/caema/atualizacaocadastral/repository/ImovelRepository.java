package br.gov.ma.caema.atualizacaocadastral.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.domain.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {

}
