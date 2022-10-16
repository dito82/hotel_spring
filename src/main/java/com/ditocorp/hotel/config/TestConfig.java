package com.ditocorp.hotel.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ditocorp.hotel.entities.Cliente;
import com.ditocorp.hotel.repositories.ClienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Cliente c2 = new Cliente(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		clienteRepository.saveAll(Arrays.asList(c1, c2));
		
	}

}
