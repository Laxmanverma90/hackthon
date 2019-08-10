package com.dna.hackthon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dna.hackthon.entity.Resource;

public interface RecommandationRepositroy extends JpaRepository<Resource, Integer> {

}
