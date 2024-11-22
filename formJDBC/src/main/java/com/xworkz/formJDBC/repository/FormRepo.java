package com.xworkz.formJDBC.repository;
import com.xworkz.formJDBC.dto.*;
public class FormRepo {


	boolean save(FormDTO dto);
	 
	 String getlistById(int id);
	 
	 String getemailByPhone(long phone);
	 
	 String  checkEmailPassword(String email, String password);
	 
	 int deleteById(int id);
	 
	String updatedByemail(String name,String address,String email);
	}