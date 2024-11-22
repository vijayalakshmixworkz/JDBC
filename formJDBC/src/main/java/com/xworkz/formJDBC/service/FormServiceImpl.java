package com.xworkz.formJDBC.service;
import com.xworkz.formJDBC.dto;
import com.xworkz.formJDBC.repository.FormRepoImpl;

public class FormServiceimpl implements FormService {

	@Override
	public boolean save(FormDTO dto) {
		FormRepoImpl registrationRepoImpl = new FormRepoImpl();
		registrationRepoImpl.save(dto);
		return true;
	}

	@Override
	public String getlistById(int id) {
		String valid = null;
		if (id != 0) {
			System.out.println("data is not null");
			FormRepoImpl registrationRepoImpl = new FormRepoImpl();
			valid = registrationRepoImpl.getlistById(id);
			System.out.println(valid);

		} else {
			System.out.println("data is null");
		}
		return valid;
	}

	@Override
	public String getemailByPhone(long phoneno) {

		String valid = null;
		if (phoneno != 0) {
			System.out.println("data is not null");
			FormRepoImpl registrationRepoImpl = new FormRepoImpl();
			valid = registrationRepoImpl.getemailByPhone(phoneno);
		} else {
			System.out.println("data is null");
		}
		return valid;
	}

	@Override
	public String checkEmailPassword(String email, String password) {
		String valid = null;

		FormRepoImpl registrationRepo = new FormRepoImpl();
		String res = registrationRepo.checkEmailPassword(email, password);
		return res;
	}

	@Override
	public int deleteById(int id) {
		FormRepoImpl registrationRepo = new FormRepoImpl();
		int res = registrationRepo.deleteById(id);
		return res;
	}

	@Override
	public String updatedByemail(String name, String address, String email) {
		String valid = null;
		FormRepoImpl registrationRepo = new FormRepoImpl();
		String res = registrationRepo.updatedByemail(name, address, email);
		return valid;
	}

}