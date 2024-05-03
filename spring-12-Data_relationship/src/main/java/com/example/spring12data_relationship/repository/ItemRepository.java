package com.example.spring12data_relationship.repository;

import com.example.spring12data_relationship.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
