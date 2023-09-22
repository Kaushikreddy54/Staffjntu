package com.example.demo.staff;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="JNTU_Staff")
public class Staff {
	
	@Id
	public String id;
	
	private String stfNum;
	private String stfFirstName;
	private String stfLastName;
	private int stfSalary;
	
//	public Staff(String id,String stfNum,String stfFirstName,String stfLastName,int stfSalary)
//		{
//		
//		this.id=id;
//		this.stfNum=stfNum;
//		this.stfFirstName=stfFirstName;
//		this.stfLastName=stfLastName;
//		this.stfSalary=stfSalary;
//		
//		 }

	
		
	}
	