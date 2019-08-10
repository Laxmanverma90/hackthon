package com.dna.hackthon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dna.hackthon.entity.Demand;
import com.dna.hackthon.repository.DemandRepositroy;

@Service
public class ProjectService {
	@Autowired
	private DemandRepositroy demRepositroy;
	
	public String addDemand(Demand demand) {
	 
		String retuenObj = null;
		 if(demRepositroy.save(demand)!= null) {
			 retuenObj = "Demand created Success";
		 } else {
			 retuenObj ="";
		 }
		 return retuenObj;
	}

}
