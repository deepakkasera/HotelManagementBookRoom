package com.example.bookroomstarter.repositories;

import com.example.bookroomstarter.models.Room;

import java.util.Optional;

public interface RoomRepository {
    Room save(Room room);

    Optional<Room> findById(long roomId);
}
