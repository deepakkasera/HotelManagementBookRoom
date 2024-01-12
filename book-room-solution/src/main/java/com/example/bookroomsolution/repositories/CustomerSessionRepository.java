package com.example.bookroomsolution.repositories;

import com.example.bookroomsolution.models.CustomerSession;

import java.util.Optional;

public interface CustomerSessionRepository {
    public CustomerSession save(CustomerSession customerSession);

    public Optional<CustomerSession> findActiveCustomerSessionByUserId(long userId);
}
