package com.smartmetro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="station")
public class Station {
    @Id
    @Column(name="station_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stationId;
    @Column(name="station_name")
    private String stationName;
    @Column(name="station_code")
    private String stationCode;
    @Column(name="location")
    private String location;

}
