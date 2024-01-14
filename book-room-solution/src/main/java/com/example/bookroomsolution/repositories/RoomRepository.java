package com.example.bookroomsolution.repositories;

import com.example.bookroomsolution.models.Room;

import java.util.Optional;

public interface RoomRepository {
    Room save(Room room);

    Optional<Room> findById(long roomId);
}
