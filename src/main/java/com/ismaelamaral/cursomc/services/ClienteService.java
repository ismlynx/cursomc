package com.ismaelamaral.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismaelamaral.cursomc.domain.Cliente;
import com.ismaelamaral.cursomc.repositories.ClienteRepository;
import com.ismaelamaral.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		
		Cliente obj = repo.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
					+ ", Tipo: " + Cliente.class.getName());
		}
		
		return obj;
	}
}
