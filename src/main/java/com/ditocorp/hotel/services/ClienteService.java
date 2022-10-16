package com.ditocorp.hotel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ditocorp.hotel.entities.Cliente;
import com.ditocorp.hotel.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public List<Cliente> findAll() {
		return repository.findAll();
	}

	public Cliente findById(Long codCliente) {
		Optional<Cliente> obj = repository.findById(codCliente);
		return obj.get();
	}
}
