package com.institute.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@JsonIgnoreProperties({"hibernateLazyInitializer"})

@Table(name="account_details")
public class AccountController {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountNo;
	@Column(name = "account_name",length = 50)
	private String accountHolderName;
	@Column(unique = true,length = 20)
	private String email;
	@Column(unique = true,length = 20)
	private long qualification;
	@Column(unique = true,length = 20)
	private long phoneNo;
	@Column( nullable = false)
	private double location;
	@Column( nullable = false ,length = 30)
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("account")
	private Institute institute;

	
	public void Account(String accountHolderName, String email, long qualification, long phoneNo, double location 
		) {
		
		this.accountHolderName = accountHolderName;
		this.email = email;
		this.qualification = qualification;
		this.phoneNo = phoneNo;
		this.location = location;
	}
}
	
	


