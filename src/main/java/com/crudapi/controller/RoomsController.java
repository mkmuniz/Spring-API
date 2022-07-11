package com.crudapi.controller;

import com.crudapi.model.Room;
import com.crudapi.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomsController {

    @Autowired
    private RoomRepository roomsRepository;

    public RoomsController(RoomRepository roomRepository) {
        this.roomsRepository = roomRepository;
    }
    @GetMapping
    public List<Room> list(){
        return null;
    }
}

