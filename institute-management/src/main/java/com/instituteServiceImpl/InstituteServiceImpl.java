package com.instituteServiceImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institute.entity.Institute;
import com.institute.exception.InstituteNotFoundException;
import com.institute.model.InstituteDto;
import com.institute.repository.InstituteRepository;
import com.institute.service.InstituteService;
import com.institute.util.InstituteConvertor;



@Service
public class InstituteServiceImpl {
	@Autowired
	private InstituteRepository instituteRepository;  //instance of bankRepository
	
	@Autowired
	private InstituteConvertor instituteConvertor;  //instance of bankConvertor
	

	public String createInstitute(Institute institute) {   //method creating new Bank
		String message = null;
		instituteRepository.save(institute);  //saving bank to database
		if(institute!=null) {
			message = "New institute is Open ..";
		}
		return message;
	} //end of method

	public InstituteDto updateInstitute(int id, Institute institute) {  //method for updating institute
		Institute getInstitute = instituteRepository.findById(id).orElseThrow(()-> new InstituteNotFoundException("Institute", "ID", id));
	getInstitute.setInstituteName(institute.getInstituteName());
	getInstitute.setBranchName(institute.getBranchName());
	getInstitute.setBranchName(institute.getBranchName());
	instituteRepository.save(getInstitute); //saving bank to database
		return instituteConvertor.convertInstituteEntityToInstituteDto(getInstitute);
	} //end of method

	public InstituteDto getInstitute(int id) {  //method for getting institute details by Id
		Institute institute = instituteRepository.findById(id).orElseThrow(()-> new InstituteNotFoundException("Institute", "ID", id));
		return instituteConvertor.convertInstituteEntityToInstituteDto(institute);
	}

	public List<InstituteDto> getAllinstituteinstituteinstituteinstitute() {   //method for showing all bank 
	List<Institute> instituteList = instituteRepository.findAll();
	List<InstituteDto> instituteDto = new ArrayList<>();
	for(Institute b: instituteList) {
		instituteDto.add(instituteConvertor.convertInstituteEntityToInstituteDto(b));
	}
		return instituteDto;
	}

	public String deleteinstitute(int id) {  //method for delete bank by id
		String message=null;
		Optional<Institute> institute=instituteRepository.findById(id);
		if(institute.isPresent()) {
			
			instituteRepository.deleteById(id);
			message = "..........Institute Delteted  Successfully.........";
		}
		else {
			message = ".........Institute Details are not found........";
		}
		return message;
	}

	public void deleteAllInstitute() {  //method for removing all bank from dataabses
		instituteRepository.deleteAll();
	}

	public List<InstituteDto> getInstituteByInstituteName1(String instituteName) {
	List<Institute> institute = instituteRepository.getInstituteByName(instituteName);
	List<InstituteDto> instituteDto = new ArrayList<>();
	for(Institute b : institute) {
		instituteDto.add(instituteConvertor.convertInstituteEntityToInstituteDto(b));
	}
		return instituteDto;
	}

	public List<InstituteDto> getInstituteByInstituteName(String branchName) {
		List<Institute> institute = instituteRepository.getInstituteByBranchName(branchName);
		List<InstituteDto> instituteDto = new ArrayList<>();
		for(Institute b : institute) {
			instituteDto.add(instituteConvertor.convertInstituteEntityToInstituteDto(b));
		}
			return instituteDto;
	}

	}





