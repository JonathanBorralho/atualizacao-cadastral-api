package br.gov.ma.caema.atualizacaocadastral.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ma.caema.atualizacaocadastral.domain.RoteiroUpload;
import br.gov.ma.caema.atualizacaocadastral.repository.RoteiroUploadRepository;

@RestController
@RequestMapping("/roteiros-upload")
public class RoteiroUploadResource {

	@Autowired
	private RoteiroUploadRepository roteiroUploadRepo;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void upload(@RequestBody RoteiroUpload roteiro) {
		roteiroUploadRepo.save(roteiro);
	}

}
