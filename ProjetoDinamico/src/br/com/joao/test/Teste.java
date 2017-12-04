package br.com.joao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import br.com.joao.repository.Repositorio;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:WebContent/WEB-INF/appContext.xml")
@TransactionConfiguration(defaultRollback = true) //configurar tx
public class Teste {
	
	@Autowired
	Repositorio r;
	
	@Test
	@Transactional
	public void testaConexao() {
		
		r.incluir(r.getItem());

	}

}
