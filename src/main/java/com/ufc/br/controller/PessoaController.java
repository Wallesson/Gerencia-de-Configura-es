package com.ufc.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ufc.br.model.Projeto;
import com.ufc.br.service.ProjetoService;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {
	

	
	@Autowired
	private ProjetoService projetoService;
	

	@RequestMapping("/inicial")
	public ModelAndView paginaPesquisador() {
		List<Projeto> projeto = projetoService.listarProjeto();
		ModelAndView mv = new ModelAndView ("PaginaPesquisador");
		mv.addObject("listaProjetos", projeto);
		return mv;
	}	
	
	@RequestMapping("/excluir/{codigoProjeto}")
	public ModelAndView excluirProjeto(@PathVariable Long codigoProjeto) {
		projetoService.excluirProjeto(codigoProjeto);
		ModelAndView mv = new ModelAndView ("redirect:/pessoa/inicial");
		return mv;
	}
	@RequestMapping("/formularioProjeto")
	public ModelAndView formularioProjeto() {
		ModelAndView mv = new ModelAndView("FormularioProjeto");
		mv.addObject("projeto", new Projeto());
		return mv;
	}


	@RequestMapping("/salvarProjeto")
	public ModelAndView salvarProjeto(@Validated Projeto projeto, BindingResult result) {
		
		ModelAndView mv = new ModelAndView("FormularioProjeto");
		
		if(result.hasErrors()) {	
			return mv;
		}
		
		projetoService.cadastrarProjeto(projeto);
		
		mv.addObject("mensagem", "Projeto cadastrado com sucesso");
		return mv;
	}
	
	
	@RequestMapping("/atualizar/{codigoProjeto}")
	public ModelAndView atualizarProjeto(@PathVariable Long codigoProjeto) {
		Projeto projeto = projetoService.buscarID(codigoProjeto);
		ModelAndView mv = new ModelAndView("FormularioProjeto");
		mv.addObject("projeto", projeto);
		return mv;
	}
}
