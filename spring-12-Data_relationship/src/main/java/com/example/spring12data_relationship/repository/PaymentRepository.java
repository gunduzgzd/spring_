package com.example.spring12data_relationship.repository;

import com.example.spring12data_relationship.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
