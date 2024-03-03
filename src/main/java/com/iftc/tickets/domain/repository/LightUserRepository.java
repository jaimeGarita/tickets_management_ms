package com.iftc.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftc.tickets.model.LightUser;


public interface LightUserRepository extends JpaRepository<LightUser, Long>{
    
}
