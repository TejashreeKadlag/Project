package com.institute.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.institute.entity.Institute;
import com.institute.model.InstituteDto;
import com.institute.entity.Institute;
import com.institute.model.InstituteDto;

@Component
public class InstituteConvertor {
	private static final Institute Institute = null;

		//Method for converting Dto to Entity
		public Institute convertBankDtoToBankEntity(InstituteDto bankDto) {
			
			Institute bank =new Institute(); //creation of object
			Object institute = null;
			return Institute;
		}
		
		//Method for converting Entity to Dto
		public InstituteDto convertInstituteEntityToInstituteDto(Institute institute) {
			InstituteDto instituteDto = new InstituteDto(); //creation of object
			if(instituteDto!=null) {
				BeanUtils.copyProperties(institute, instituteDto); //copy properties of bankDto
			}
			return instituteDto;
		}

		public static Institute convertInstituteDtoToInstituteEntity(InstituteDto instituteDto) {
			// TODO Auto-generated method stub
			return null;
		}

		public InstituteDto convertInstituteEntityToInstituteDto1(Institute getInstitute) {
			// TODO Auto-generated method stub
			return null;
		}
}
