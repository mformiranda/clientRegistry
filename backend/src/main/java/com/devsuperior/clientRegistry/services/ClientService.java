package com.devsuperior.clientRegistry.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.clientRegistry.entities.Client;
import com.devsuperior.clientRegistry.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	public List<Client> findAll() {
		return repository.findAll();
	}
	
}
