package br.com.joao.webservice;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.joao.entity.Item;
import br.com.joao.service.Servico;

@Component
@WebService(endpointInterface="br.com.joao.webservice.ServicoSoapEndPoint")
public class ServicoSoap implements ServicoSoapEndPoint{

	@Autowired
	Servico s;
	
	@Override
	public Item getItem() {
		Item i = s.getItem();
		return i;
	}
	

}
