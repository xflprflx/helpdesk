package com.xflprflx.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xflprflx.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
