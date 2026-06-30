package com.smartmetro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="payment ")
public class Payment {
    @Id
    @Column(name="payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentId;
    @Column(name="card_id")
    private long cardId;
    @Column(name="amount")
    private double amount;
    @Column(name="payment_method")
    private String paymentMethod;
    @Column(name="status")
    private String status;
    @Column(name="payment_date")
    private int paymentDate;
    private MetroCard metroCard;

}
