package com.xworkz.formJDBC.service;

public class FormService {

	boolean save(FormDTO dto);
	   
	   String getlistById(int id);
	   
	   String getemailByPhone(long phone);
	   
	   String  checkEmailPassword(String email, String password);
	   
	   int deleteById(int id);
	   
	   String updatedByemail(String name,String address,String email);
	}