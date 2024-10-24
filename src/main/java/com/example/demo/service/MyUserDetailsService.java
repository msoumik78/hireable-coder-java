package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

  private final JdbcTemplate jdbcTemplate;

  private final String selectSQL = "Select * from users where username = ? ";

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("user");
    return jdbcTemplate.queryForObject(selectSQL,
      new Object[]{username},
      (rs, rowNum) ->
        new User(
          rs.getString(1),
          rs.getString(2),
          List.of(simpleGrantedAuthority)
        ));
  }
}
