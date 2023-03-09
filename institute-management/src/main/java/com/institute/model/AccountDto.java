package com.institute.model;


import com.institute.entity.Institute;

import lombok.Getter.*;
import lombok.Setter.*;


public class AccountDto {
	private int accountNo;
	
	private String accountHolderName;	
	
	private String accountType;
	
	private long phoneNo;
	
	private Institute institute;
}

