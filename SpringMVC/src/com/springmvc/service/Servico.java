package com.springmvc.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.controller.Controlador;
import com.springmvc.entity.Entidade;
import com.springmvc.repository.Repositorio;

@Service
public class Servico {
	Logger logger = LoggerFactory.getLogger(Servico.class);
	
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
