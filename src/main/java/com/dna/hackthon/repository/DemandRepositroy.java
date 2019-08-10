package com.dna.hackthon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dna.hackthon.entity.Demand;

public interface DemandRepositroy extends JpaRepository<Demand, Integer> {

}
