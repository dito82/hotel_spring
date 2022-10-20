package com.ditocorp.hotel.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ditocorp.hotel.entities.Cliente;
import com.ditocorp.hotel.entities.Reserva;
import com.ditocorp.hotel.repositories.ClienteRepository;
import com.ditocorp.hotel.repositories.ReservaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ReservaRepository reservaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Cliente c2 = new Cliente(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Reserva r1 = new Reserva(null, "1001", Instant.parse("2019-06-20T19:53:07Z"), c1);
		Reserva r2 = new Reserva(null, "1002", Instant.parse("2019-07-21T03:42:10Z"), c2);
		Reserva r3 = new Reserva(null, "1001", Instant.parse("2019-07-22T15:21:22Z"), c1);
		
		clienteRepository.saveAll(Arrays.asList(c1, c2));
		reservaRepository.saveAll(Arrays.asList(r1, r2, r3));
		
	}

}
