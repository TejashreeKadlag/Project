package com.institute;
/*
@AuthorName = Tejashree Kadlag
@ProjectName = Institute management System
@Date = 9-3-23
*/

//imporitng classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Main Application class
@SpringBootApplication
public class InstituteManagementProjectApplication {

	//main Method
	public static void main(String[] args) {
		SpringApplication.run(InstituteManagementSystemApplication.class, args);  //it will run our spring boot project
		System.out.println("--------Running------------");  //printing statement
	}

}
