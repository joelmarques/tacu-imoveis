package br.com.tacu.tacuimoveis.api.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Imovel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3636058573082351136L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	
	public Imovel() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
