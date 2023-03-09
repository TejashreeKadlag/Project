package com.institute.service;

import java.util.List;

import com.institute.controller.Account;
import com.institute.entity.Institute;
import com.institute.model.AccountDto;
import com.institute.model.InstituteDto;

public interface AccountService {
  String createStudent(Institute student);
  InstituteDto updateStudent(int id, Institute student);
   InstituteDto getStudent(int id);
   List<InstituteDto> getAllStudents();
   String deleteStudentById(int id);
    void deleteAllStudents();
	String createInstitute(Institute institute);
	InstituteDto updateInstitute(int id, Institute institute);
	InstituteDto getInstitute(int id);
	List<InstituteDto> getAllInstitutes();
	String deleteInstituteById(int id);
	void deleteAllInstitutes();
	String courses(Object dateNo, int types, double amount);
	AccountDto updateAccount1(int id, Account account);
	String getAccount(Account account);
	List<AccountDto> getAllAccount();
	AccountDto updateAccount11(int id, Account account);
	AccountDto updateAccount(int id, Account account);
   
  
}
