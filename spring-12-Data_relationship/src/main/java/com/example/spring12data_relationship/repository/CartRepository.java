package com.example.spring12data_relationship.repository;

import com.example.spring12data_relationship.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
