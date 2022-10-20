package com.ditocorp.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditocorp.hotel.entities.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
