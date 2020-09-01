package com.ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ufc.br.model.Projeto;

@Repository
public interface ProjetoRepository  extends JpaRepository<Projeto, Long>{

}
