package com.ditocorp.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditocorp.hotel.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
