package com.ditocorp.hotel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ditocorp.hotel.entities.Reserva;
import com.ditocorp.hotel.repositories.ReservaRepository;

@Service
public class ReservaService {

	@Autowired
	private ReservaRepository repository;

	public List<Reserva> findAll() {
		return repository.findAll();
	}

	public Reserva findById(Long codReserva) {
		Optional<Reserva> obj = repository.findById(codReserva);
		return obj.get();
	}
}
