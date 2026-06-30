package com.smartmetro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="metro_card ")
public class MetroCard {
    @Id
    @Column(name="card_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardId;
    @Column(name="card_number")
    private String cardNumber;
    @Column(name="balance")
    private double balance;
    @Column(name="status")
    private String status;
    @Column(name="user_id")
    private int userId;
    @Column(name="issue_date")
    private Date issuedDate;
    private Users users;
    private List<Trip> trips;
    private List<TransactionHistory> transactions;
    private List<Payment> payments;


}
