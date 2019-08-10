package com.dna.hackthon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dna.hackthon.entity.Role;

public interface RoleRepositroy extends JpaRepository<Role, Integer> {

}
