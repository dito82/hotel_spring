package com.ditocorp.hotel.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ditocorp.hotel.entities.Reserva;
import com.ditocorp.hotel.services.ReservaService;

@RestController
@RequestMapping(value = "/reservas")
public class ReservaResource {

	@Autowired
	private ReservaService service;

	@GetMapping
	public ResponseEntity<List<Reserva>> findAll() {
		List<Reserva> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{codReserva}")
	public ResponseEntity<Reserva> findById(@PathVariable Long codReserva) {
		Reserva obj = service.findById(codReserva);
		return ResponseEntity.ok().body(obj);
	}

}
