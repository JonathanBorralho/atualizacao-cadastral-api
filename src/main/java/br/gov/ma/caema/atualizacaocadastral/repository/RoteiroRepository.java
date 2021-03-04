package br.gov.ma.caema.atualizacaocadastral.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ma.caema.atualizacaocadastral.domain.Roteiro;

public interface RoteiroRepository extends JpaRepository<Roteiro, Long> {

	List<Roteiro> findByCadastranteId(Long cadastranteId);
	
	List<Roteiro> findByCadastranteMatricula(String matricula);
}
