package com.crudapi.Room;

import com.crudapi.Room.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomsController {

    @Autowired
    private final RoomsService roomsService;

    public RoomsController(RoomsService roomsService) {
        this.roomsService = roomsService;
    }
    @GetMapping
    public List<Room> list() {
        return roomsService.getRooms(roomsService);
    };
}

