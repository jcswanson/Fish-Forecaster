package com.jcs.f4c.entities;

import lombok.Data;

import javax.persistence.*;
import com.jcs.f4c.entities.User;

@Table(name = "loc_records")
@Data
@Entity
public class Record {
    private static final long serialVersionUid = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rec_id")
    private long recordId;

//    private User user;
    private String observations;
    @Column(name = "catch_num")
    private Integer catchNumber;

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
