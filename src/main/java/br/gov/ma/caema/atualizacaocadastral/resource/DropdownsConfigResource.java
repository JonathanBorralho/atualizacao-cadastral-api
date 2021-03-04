package br.gov.ma.caema.atualizacaocadastral.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.ma.caema.atualizacaocadastral.infra.DropdownsConfig;
import br.gov.ma.caema.atualizacaocadastral.service.DropdownsConfigService;

@RestController
@RequestMapping("/dropdownsConfig")
public class DropdownsConfigResource {
	
	@Autowired
	private DropdownsConfigService dropdownsConfigService;
	
	@GetMapping
	public DropdownsConfig list() {
		return dropdownsConfigService.getConfig();
	}
}
