package com.ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufc.br.model.Projeto;
import com.ufc.br.repository.ProjetoRepository;

@Service
public class ProjetoService {
	
	@Autowired
	private ProjetoRepository projetoRepository;
	
	public void cadastrarProjeto (Projeto projeto) {
	
		projetoRepository.save(projeto);
	}
	public List<Projeto> listarProjeto(){
		return projetoRepository.findAll();
	}
	public Projeto buscarID(Long codigoProjeto) {
		return projetoRepository.getOne(codigoProjeto);
	}
	public void excluirProjeto(Long codigoProjeto) {
		projetoRepository.deleteById(codigoProjeto);
		
	}

}
