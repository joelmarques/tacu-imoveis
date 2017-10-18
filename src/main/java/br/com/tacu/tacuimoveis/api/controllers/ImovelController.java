package br.com.tacu.tacuimoveis.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tacu.tacuimoveis.api.models.Imovel;
import br.com.tacu.tacuimoveis.api.services.ImovelService;

@RestController
@RequestMapping("/api")
public class ImovelController {
	
	@Autowired
	private ImovelService imovelService;

	@GetMapping("/imoveis")
	public List<Imovel> getImoveis() {
		Imovel imovel = new Imovel();
		imovel.setDescricao("Descricao A");
		this.imovelService.salvar(imovel);
		return this.imovelService.buscarImoveis();
	}
	
}
