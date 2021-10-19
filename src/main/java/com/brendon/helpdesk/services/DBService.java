package com.brendon.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brendon.helpdesk.domain.Chamado;
import com.brendon.helpdesk.domain.Cliente;
import com.brendon.helpdesk.domain.Tecnico;
import com.brendon.helpdesk.domain.enums.Perfil;
import com.brendon.helpdesk.domain.enums.Prioridade;
import com.brendon.helpdesk.domain.enums.Status;
import com.brendon.helpdesk.repositories.ChamadoRepository;
import com.brendon.helpdesk.repositories.ClienteRepository;
import com.brendon.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Brendon ALex", "45273526876", "brendon_gama@hotmail.com", "123" );
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "12345678912", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
