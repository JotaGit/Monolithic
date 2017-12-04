package br.com.joao.repository;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.joao.entity.Item;

@Repository
public class Repositorio implements Dao{
	final static Logger logger = Logger.getLogger(Repositorio.class);
	
	@PersistenceContext
	EntityManager em;
	
	HashMap<Integer, Item> bd = new HashMap<Integer,Item>();
	int increment=0;
	
	public void init() {
		for(int i=increment; i<10;) {
			Item it = new Item();
			it.setId(i);
			it.setNome("Nome!".concat(String.valueOf(i)));
			it.setDescricao("Descrição!".concat(String.valueOf(i)));
			this.incluir(it);
		}
		
	}
	
	//@Transactional
	public Item getItem() {
		Item i = new Item();
		i.setId(1);
		i.setNome("Nome!");
		i.setDescricao("Descrição!");
		//em.persist(i);
		return i;
	}

	@Override
	public Object incluir(Object o) {
		this.increment++;
		Item i = (Item) o;
		i.setId(increment);
		this.bd.put(increment, i);
		//em.persist(i);
		return i;
	}

	@Override
	public Boolean excluir(Object o) {
		this.bd.remove((Item) o);
		return Boolean.TRUE;
	}

	@Override
	public Object save(Object o) {
		Item i = (Item) o;
		this.bd.replace(i.getId(), (Item) o);
		return (Item) o;
	}

	@Override
	public Object findById(Object o) {
		Item i = (Item) o;
		this.bd.get(i.getId());
		return (Item) o;
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
