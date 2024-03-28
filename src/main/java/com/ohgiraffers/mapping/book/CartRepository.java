package com.ohgiraffers.mapping.book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CartRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(Cart cart) {
        manager.persist(cart);
    }
}
