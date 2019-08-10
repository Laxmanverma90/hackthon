package com.dna.hackthon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dna.hackthon.entity.User;

public interface UserRepositroy extends JpaRepository<User, Integer> {

}
