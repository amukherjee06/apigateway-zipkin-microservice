package com.arnab.microservice.user.userservice.value.object;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	
	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;	

}
