package br.com.joao.repository;

import java.util.List;

public interface Dao {

	public Object incluir(Object o);
	
	public Boolean excluir(Object o);
	
	public Object save(Object o);
	
	public Object findById(Object o);
	
	public List<Object> findAll();
}
