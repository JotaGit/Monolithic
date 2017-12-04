package br.com.joao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joao.entity.Item;
import br.com.joao.repository.Repositorio;

@Service
public class Servico {

	@Autowired
	Repositorio r;
	
	public Item getItem() {
		Item i = r.getItem();
		return i;
	}
	
	
}
