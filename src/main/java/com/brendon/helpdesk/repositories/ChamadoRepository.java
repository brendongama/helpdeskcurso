package com.brendon.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brendon.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
