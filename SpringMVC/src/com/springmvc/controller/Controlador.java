package com.springmvc.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springmvc.entity.Entidade;
import com.springmvc.service.Servico;
import com.springmvc.utils.Utils;

@Controller
@RequestMapping("/")
public class Controlador {
	Logger logger = LoggerFactory.getLogger(Controlador.class);
	
	@Autowired
	Servico s;
	
	@GetMapping
	public ModelAndView index(Entidade entidade) {
		//command é utilizado para enviar um item novo.
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("listagem", s.getLista());
		mv.addObject(entidade);
		return mv;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView editEntidade(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView("/index");
		Entidade entidadeEncontrada = s.findEntidade(id);
		if(entidadeEncontrada != null) {
			mv.addObject("entidade", entidadeEncontrada); 
			mv.addObject("listagem", s.getLista());
			return mv;
		}

		return null;
	}
	
	@PostMapping("/salvar")
	public ModelAndView addEntidade(@Valid Entidade entidade, BindingResult bindingResult, RedirectAttributes attributes) {

        if (bindingResult.hasErrors()) {
        	return index(entidade);
        }
    
		if(s.salvar(entidade)) {
			logger.info("Incluido com sucesso!");
		}else {
			logger.info("Erro ao tentar incluir!");
		}
		
		attributes.addFlashAttribute("mensagem", Utils.getMessage("salvar.sucesso"));
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/excluir/{id}")
	public ModelAndView delEntidade(@PathVariable("id") Integer id, RedirectAttributes attributes) {
		Entidade e = s.findEntidade(id);
		if(s.excluir(e)) {
			logger.info("{excluir.sucesso}");
		}else {
			logger.info("Erro ao tentar atualizar!");
		}
		
		attributes.addFlashAttribute("mensagem", Utils.getMessage("excluir.sucesso"));
		return new ModelAndView("redirect:/");
	}

}
