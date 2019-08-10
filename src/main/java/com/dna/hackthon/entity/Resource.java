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
@Table(name="dna_resource")
public class Resource {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String userId;
	private String name;
	private String primarySkill;
	private String secondarySkill;
	private String email;
	private String location;
	private String total_experience;
	private String relativeExperience;
	private String availablity;
	private String projectId;
	private String projectStartBy;
	private String projectEndby;
}
