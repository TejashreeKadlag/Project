package com.institute.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Institute;
import com.institute.model.InstituteDto;
import com.institute.service.InstituteService;
import com.institute.util.InstituteConvertor;


@RestController
public class InstituteController {
	@Autowired
	private InstituteService instituteService;
	@Autowired
	private InstituteConvertor instituteConvertor;
	
	@PostMapping("/createInstitute")
	public String createBank(@RequestBody InstituteDto instituteDto) {
		final Institute institute = InstituteConvertor.convertInstituteDtoToInstituteEntity(instituteDto);
		return instituteService.createInstitute(institute);
	}
	
	@PutMapping("/updateInstitute/{id}")
	public InstituteDto updateBank(@PathVariable("id") int id ,@RequestBody InstituteDto instituteDto) {
		Institute institute = instituteConvertor.convertInstituteDtoToInstituteEntity(instituteDto);
		return instituteService.updateInstitute(id, institute);
		
	}
	
	@GetMapping("/getInstitute/{id}")
	public InstituteDto getInstitute(@PathVariable("id") int id) {
		return instituteService.getInstitute(id);
	}
	
	@GetMapping("/getAllInstitute")
	public List<InstituteDto> getAllInstitute(){
		return instituteService.getAllInstitute();
	}
	
	@DeleteMapping("/deleteInstitute/{id}")
	public String deleteInstitute(@PathVariable("id") int id) {
		return instituteService.deleteInstitute(id);
	}
	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAll(){
		instituteService.deleteAllInstitute();                                     
		return new ResponseEntity<String>("All Details Are Deleted" , HttpStatus.OK);
	}
	
	@GetMapping("/getByName/{name}")
	public List<InstituteDto> getInstituteByName(@PathVariable("name") String instituteName){
		return instituteService.getInstituteByName(instituteName);
	}

	@GetMapping("/getByBranch/{branch}")
	public List<InstituteDto> getBranchBybranchName(@PathVariable("branch") String branchName) {
		return instituteService.getInstituteByBranchName(branchName);
	}
	
	@GetMapping("/getByLocation/{location}")
	public List<InstituteDto> getBranchbyBranchLocation(@PathVariable("location") String branchLocation){
		return instituteService.getInstitutebyBranchLocation(branchLocation);
	}
}
