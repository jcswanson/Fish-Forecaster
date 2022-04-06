package com.jcs.f4c.entities;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Getter
@Setter
@Entity
//@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
////@RequiredArgsConstructor

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long uid;

    private String cellphone;
    private String username;
    private String password;
    private String email;
    private String role = "ROLE_USER";
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "user", orphanRemoval = true)
    private List<LocationRecord> locationRecords;

    public User() {
    }
    public void addRecord(LocationRecord locationRecord){
        locationRecord.setUser(this);
        this.locationRecords.add(locationRecord);
    }

}