package com.example.spring12data_relationship.repository;

import com.example.spring12data_relationship.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant,Long> {
}
