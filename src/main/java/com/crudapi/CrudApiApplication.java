package com.crudapi;

import com.crudapi.model.Room;
import com.crudapi.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApiApplication.class, args);
	}
	@Bean
	CommandLineRunner initDataBase(RoomRepository roomRepository) {
		return args -> {
			roomRepository.deleteAll();

			Room r = new Room();

			r.setName("Sala Teste");

			roomRepository.save(r);
		};
	}
}
