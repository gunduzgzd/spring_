package com.example.spring11data_tablecreation.entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;


@Entity
public class DebitAccount extends Account {

    private BigDecimal overDraftFee;
}
