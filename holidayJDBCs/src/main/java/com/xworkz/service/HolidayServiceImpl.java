package com.xworkz.service;

import com.xworkz.dto.HolidayDto;
import com.xworkz.repository.HolidayRepoImpl;

public class HolidayServiceImpl implements HolidayService{

	@Override
	public boolean save(HolidayDto dto) {
		System.out.println("this is service class name=="+dto.getName());
		System.out.println("this is service class email=="+dto.getEmail());
		HolidayRepoImpl holidayRepoImpl=new HolidayRepoImpl();
		boolean saved=holidayRepoImpl.save(dto);
		System.out.println("saved=="+saved);
		return saved;
	}

}
