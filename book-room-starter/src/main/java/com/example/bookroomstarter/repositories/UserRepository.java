package com.example.bookroomstarter.repositories;

import com.example.bookroomstarter.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long id);

    User save(User user);
}
