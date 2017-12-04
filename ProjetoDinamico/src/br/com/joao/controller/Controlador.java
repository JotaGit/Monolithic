package br.com.joao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.joao.entity.Item;
import br.com.joao.service.Servico;

@Controller(value="ctrl")
public class Controlador {
	
	@Autowired
	Servico s;
	
	Item item;
	List<Item> lista = new ArrayList<>();
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index", "command", new Item());
		return mv;
	}
	

	@RequestMapping("/acao")
	public ModelAndView acao(@ModelAttribute("item") Item i) {
		System.out.println("entrou em acao!");
		this.getLista().add(i);
		ModelAndView mv = new ModelAndView("listagem", "lista", this.getLista());
		return mv;
	}

	
	
	
	//---- Getters and Setters
	public List<Item> getLista() {
		return lista;
	}

	public void setLista(List<Item> lista) {
		this.lista = lista;
	}

	public Item getItem() {
		return this.item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}

}
