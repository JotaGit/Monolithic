package br.com.joao.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.joao.entity.Item;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ServicoSoapEndPoint {
		@WebMethod Item getItem();
	

}
