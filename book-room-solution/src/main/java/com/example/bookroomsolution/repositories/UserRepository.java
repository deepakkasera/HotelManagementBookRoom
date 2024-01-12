package com.example.bookroomsolution.repositories;

import com.example.bookroomsolution.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long id);

    User save(User user);
}
