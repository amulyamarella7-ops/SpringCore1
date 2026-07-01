package com.smartmetro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DialectOverride;

@Getter
@Setter
@Entity
@Table(name="trip")
public class Trip {
    @Id
    @Column(name="trip_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripId;
   // @Column(name="card_id")
    //private long cardId;
   // @Column(name="entry_station_id")

    //private long entryStationId;
   // @Column(name="exit_station_id")
   // private long exitStationId;
    @Column(name="start_time")

    private int startTime;
    @Column(name="end_time")
    private int endTime;
    @Column(name="fare_amount")

    private double fareAmount;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="entry_station_id")
    private Station entryStation;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="exit_station_id")
    private Station exitStation;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="card_id",referencedColumnName = "card_Id")
    private MetroCard metroCard;



}
