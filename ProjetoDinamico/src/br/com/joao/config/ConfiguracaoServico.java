package br.com.joao.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.joao.webservice.ServicoSoap;

//@Configuration
public class ConfiguracaoServico {

    //@Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    
	//@Bean
	public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), new ServicoSoap());
        endpoint.publish("http://localhost:8080/ProjetoDinamico/services");
        return endpoint;
	}
}
