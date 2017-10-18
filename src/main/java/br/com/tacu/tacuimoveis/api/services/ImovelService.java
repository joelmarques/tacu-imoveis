package br.com.tacu.tacuimoveis.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tacu.tacuimoveis.api.models.Imovel;
import br.com.tacu.tacuimoveis.api.repositories.ImovelRepository;

@Service
public class ImovelService {

	@Autowired
	private ImovelRepository imovelRepository;
	
	public Imovel salvar(final Imovel imovel) {
		return this.imovelRepository.save(imovel);
	}
	
	public List<Imovel> buscarImoveis() {
		return this.imovelRepository.findAll();
	}
}
