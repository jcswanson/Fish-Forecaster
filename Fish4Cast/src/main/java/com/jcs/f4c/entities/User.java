package com.jcs.f4c.entities;

import com.jcs.f4c.security.Authority;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Getter
@Setter
@Entity
//@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
////@RequiredArgsConstructor

public class User implements Serializable {
    //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer uid;

    private String cellphone;
    private String username;
    private String password;
    private String email;


//    private List<Record> records;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Authority> authorities;



    public User() {
    }


}