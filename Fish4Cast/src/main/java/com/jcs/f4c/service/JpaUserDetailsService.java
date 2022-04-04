package com.jcs.f4c.service;

import com.jcs.f4c.repository.UserRepository;
import com.jcs.f4c.entities.User;

import com.jcs.f4c.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.security.Principal;
import java.util.Optional;
import java.util.function.Supplier;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByPrincipal(Principal principal){
        Optional<User> user = userRepository.findUserByUsername(principal.getName());
        user.orElseThrow(() -> new UsernameNotFoundException( "User not found."));
        return user.get();

    }
// LOOK HERE
    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supplier<UsernameNotFoundException> s =
                () -> new UsernameNotFoundException("Problem Authenticating User!");

        User user = userRepository
                .findUserByUsername(username)
                .orElseThrow(s);
        return new CustomUserDetails(user);

        //        Optional<User> user = userRepo.findByUsername(username);
//        user.orElseThrow(() -> new UsernameNotFoundException(username + " not found."));
//
//        return user.map(User::new).get();


    }





}
