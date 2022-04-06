package com.jcs.f4c.entities;

import lombok.Data;

import javax.persistence.*;

@Table(name = "records")
@Data
@Entity
public class LocationRecord {
    private static final long serialVersionUid = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rec_id")
    private Long recordId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_records")
    private User user;
    private String observations;
    private Double lat;
    private Double lng;
    @Column(name = "catch_num")
    private Integer catchNumber;
    @Column(name = "air_temp")
    private Double airTemp;
    @Column(name = "water_temp")
    private Double waterTemp;
    @Column(name = "swell_height")
    private Double waveHeight;
    @Column(name = "swell_dir")
    private Double waveDirection;
    private String tide;
//    @OneToMany
//    private Location location;
//
//    private Fish fishCaught;
//
//    private WeatherConditions weather;
//
//    private OceanConditions oceanConditions;
//
//    private String observations;
}
