package com.crudapi.controller;

import com.crudapi.model.Room;
import com.crudapi.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomsController {

    @Autowired
    private RoomRepository roomsRepository;

    public RoomsController(RoomRepository roomRepository) {
        this.roomsRepository = roomRepository;
    }
    @GetMapping("/listar")
    public List<Room> list(){

        return roomsRepository.findAll();
    }
    @PostMapping("/criar")
    public Room room(@RequestParam String nome) {

        Room r = new Room();

        r.setName(nome);

        return roomsRepository.save(r);
    }
}

