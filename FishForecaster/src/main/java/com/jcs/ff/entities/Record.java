package com.jcs.ff.entities;

//@Entity
//@Table(name = "loc_records")
//@Data
public class Record {
    private static final long serialVersionUid = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "rec_Id")
    private long recordId;

//    @OneToMany
    private Location location;

    private Fish fishCaught;

    private WeatherConditions weather;

    private OceanConditions oceanConditions;

    private String observations;
}
