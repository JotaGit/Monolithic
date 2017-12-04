package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.entity.Entidade;
import com.springmvc.repository.Repositorio;

@Service
public class Servico {
	
	@Autowired
	Repositorio r;
	
	public List<Entidade> getLista(){
		return r.getLista();
	}

	public Boolean salvar(Entidade e) {
		return r.salvar(e);
	}

	public Entidade findEntidade(Integer id) {
		return r.findById(id);
	}

	public boolean excluir(Entidade e) {
		return r.excluir(e);
	}

}
