package com.dna.hackthon.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dna.hackthon.entity.Demand;
import com.dna.hackthon.service.ProjectService;

@RestController
 @CrossOrigin(origins = "http://10.117.189.112:8080")
public class ProjectController {
	@Autowired
    private ProjectService projectService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/demand")
	public ResponseEntity<String> addDemand(@RequestBody Demand demand) {
		
		return new ResponseEntity<String>(projectService.addDemand(demand), HttpStatus.CREATED);
	}
	
	
}
