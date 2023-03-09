package com.institute.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.institute.entity.Account;
import com.institute.model.AccountDto;
import com.institute.entity.Institute;
import com.institute.model.InstituteDto;

@Component
public class AccountConvertor {
	//Method for converting Dto to Entity
		public Account convertAccountDtoToAccountEntity(InstituteDto accountDto) {
			
			Account account =new Account(); //creation of object
			if(account!=null) {
				BeanUtils.copyProperties(accountDto, account); //copy properties of bank
			}
			return account;
		}
		
		//Method for converting Entity to Dto
		public AccountDto convertAccountEntityToAccountDto(Account account) {
			AccountDto accounDto =new AccountDto(); //creation of object
			if(accounDto!=null) {
				BeanUtils.copyProperties(account, accounDto); //copy properties of bankDto
			}
			return accounDto;
		}

		public Institute convertToEntity(InstituteDto instituteDto) {
			// TODO Auto-generated method stub
			return null;
		}
}
