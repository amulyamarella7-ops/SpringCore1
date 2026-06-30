package com.smartmetro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="transaction_history")
public class TransactionHistory {
    @Id
    @Column(name="txn_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long txnId;
    @Column(name="card_id")
    private long cardId;
    @Column(name="amount")
    private double amount;
    @Column(name="txn_type")
    private String txnType;
    @Column(name="tnx_date")
    private int txnDate;
    private MetroCard metroCard;

}
