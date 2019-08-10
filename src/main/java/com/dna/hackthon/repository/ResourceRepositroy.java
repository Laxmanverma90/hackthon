package com.dna.hackthon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dna.hackthon.entity.Recommandation;

public interface ResourceRepositroy extends JpaRepository<Recommandation, Integer> {

}
