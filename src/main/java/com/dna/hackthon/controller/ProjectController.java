package com.dna.hackthon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dna.hackthon.entity.Demand;
import com.dna.hackthon.service.ProjectService;

@RequestMapping("/demandmanagement")
@RestController
public class ProjectController {
	@Autowired
    private ProjectService projectService;
	
	@PostMapping("/demand")
	public ResponseEntity<String> addDemand(@RequestBody Demand demand) {
		
		return new ResponseEntity<String>(projectService.addDemand(demand), HttpStatus.CREATED);
	}
}
