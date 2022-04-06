package com.jcs.f4c.service;

import com.jcs.f4c.repository.UserRepository;
import com.jcs.f4c.entities.User;

import com.jcs.f4c.entities.CustomUserDetails;
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
        Optional<User> user = userRepository.findByUsername(principal.getName());
        user.orElseThrow(() -> new UsernameNotFoundException( "User not found."));
        return user.get();

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
//        user.orElseThrow(() -> new UsernameNotFoundException(username + " not found."));
        return Optional.ofNullable(user).orElseThrow(()->new UsernameNotFoundException("Username Not Found"))
                .map(CustomUserDetails::new).get();
//        return user.map(CustomUserDetails::new).get();

    }





}
