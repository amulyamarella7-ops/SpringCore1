package com.smartmetro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="route")
public class Route {
    @Id
    @Column(name="route_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int routeId;
    @Column(name="route_name")
    private String routeName;
    private List<RouteStation> routeStations;


}
