package com.springmvc.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springmvc.entity.Entidade;

@Repository
public class Repositorio {

	int increment = 0;
	Map<Integer, Entidade> bd = new HashMap<Integer, Entidade>();

	public Boolean salvar(Entidade e) {
		if(e.getId() == null) {
			e.setId(increment);
			bd.put(increment, e);
			increment++;
		}else {
			bd.replace(e.getId(), e);
		}

		return true;
	}

	public List<Entidade> getLista() {
		return new ArrayList<>(bd.values());
	}

	public Boolean excluir(Entidade e) {
		bd.remove(e.getId());
		return true;
	}

	public Entidade findById(Integer id) {
		return bd.get(id);
	}

}
