package com.dna.hackthon.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DemandDto {

	private int id;
	private String primarySkill;
	private String secondarySkill;
	private LocalDate startByDate;
	private String location;
	private int experience;
	private int projectId;
	private int managerId;
}
