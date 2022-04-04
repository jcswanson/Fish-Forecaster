package com.jcs.f4c.entities;

//@Entity
//@Data
//@Table(name = "locations")
public class Location {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "loc_id")
    private long locId;

    private Double latitude;

    private Double longitude;

    public Location(){

    }

}
