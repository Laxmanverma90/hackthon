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
public class RecommandationDto {

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
