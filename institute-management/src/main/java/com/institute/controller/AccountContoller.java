package com.institute.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Account;
import com.institute.entity.Institute;
import com.institute.model.InstituteDto;
import com.institute.service.InstituteService;
import com.institute.util.AccountConvertor;
import com.institute.util.InstituteConvertor;

@RestController
public class AccountContoller {
   @Autowired
	private InstituteService instituteService;
  @Autowired
   private AccountConvertor convertor;
  @PostMapping("/createInstitute")
   public String createInstitute(@RequestBody InstituteDto instituteDto)
   {
	 final Institute institute= convertor.convertToEntity(instituteDto);
	 return instituteService.createInstitute(institute);
   }
    @PutMapping("/updateInstitute/{identity}")
  public InstituteDto updateInstitute(@PathVariable("identity") int id, @RequestBody InstituteDto studentDto)
  {
	  InstituteDto instituteDto = null;
	Institute institute= convertor.convertToEntity(instituteDto);
	  Institute institute1 = null;
	return instituteService.updateInstitute(id, institute1);
  }
    
    @GetMapping("/getInstitute/{identity}")
    public InstituteDto getInstitute(@PathVariable("identity") int id)
    {
    	//institute institute2=converter.convertToEntity(instituteDTO);
    return instituteService.getInstitute (id);
    	
    }
    @GetMapping("/getAllInstitute")
    public List<InstituteDto> getAllInstitutes()
    {
    	return instituteService.getAllInstitute();
    }
    @DeleteMapping("/deleteInstituteById/{id}")
    public String deleteInstituteById(@PathVariable("id") int id)
    {
    	return instituteService.deleteInstitute(id);
    	
    }
    @DeleteMapping("/deleteAllInstitutes")
    public void deleteAllInstitutes()
    {
    	instituteService.deleteAllInstitute();
    	
    }
	public AccountDto convertAccountEntityToAccountDto(Account a) {
		// TODO Auto-generated method stub
		return null;
	}
}
