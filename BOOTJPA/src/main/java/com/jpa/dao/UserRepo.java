package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
