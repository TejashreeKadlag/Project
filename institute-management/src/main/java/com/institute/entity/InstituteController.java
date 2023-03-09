package com.institute.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name= "institute")
public class InstituteController {

	private static final String ContactNo = null;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name= "institute_name", unique = true,length = 50)
	private String instituteName;
	@Column(name= "institute_name", unique = true,length = 50)
	private String branchName;
	@Column(name= "branch_location",length = 30)
	private String branchLocation;
	@Column(name= "qualificatiion", unique = true,length = 20)
	private String location;
	private String InstituteName;
	private Object PhNo;
	@Builder
	public void Bank(String bankName, String branchName, String branchLocation, String ifscCode) {
	
		this.InstituteName = InstituteName;
		this.branchName = branchName;
		this.branchLocation = branchLocation;
		this.PhNo = PhNo;
	}
	
	
}


