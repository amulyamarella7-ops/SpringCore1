package com.smartmetro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@IdClass(RouteStationCompositePrimaryKey.class)
@Table(name="route_station")
public class RouteStation {

     //@Column(name="route_id")
     //private int routeId;
     //@Id
     //@Column(name="station_id")
     //private int stationId;
     //@Column(name="sequence_no")
     //private int sequenceNo;
     @Id
     @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
     @JoinColumn(name="route_id")
     private  Route route;
     @Id
     @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
     @JoinColumn(name="station_id")
     private Station station;
     @Column(name="sequence_no")
     private int sequenceNo;





}
