package com.dna.hackthon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dna_recommandation")
public class Recommandation {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String userId;
	private String primarySkill;
	private String secondarySkill;
	private String location;
	private int projectId;
	private String managerId;
	private String trainSkills;
	private String duration;
	private String status;
}
