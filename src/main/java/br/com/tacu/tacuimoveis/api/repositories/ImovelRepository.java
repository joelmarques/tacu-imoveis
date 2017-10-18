package br.com.tacu.tacuimoveis.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tacu.tacuimoveis.api.models.Imovel;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {

}
