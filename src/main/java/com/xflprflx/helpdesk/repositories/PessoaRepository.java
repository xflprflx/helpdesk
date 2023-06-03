package com.xflprflx.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xflprflx.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
