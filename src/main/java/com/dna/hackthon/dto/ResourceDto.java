package com.dna.hackthon.dto;

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
public class ResourceDto {

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
