package com.example.demo.staff;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
	
	@Autowired
	public StaffRepository stfRepo;
	
	public Staff create(Staff stf)
	{
		return stfRepo.save(stf);
	}
	
	public List<Staff> getAll()
	{
		return stfRepo.findAll();
	}
	
	public Optional<Staff> getById(String id)
	{
		return stfRepo.findById(id);
	}
	
	public Staff update(String id,Staff stf)
	{
		stf.setId(id);
		return stfRepo.save(stf);
	}
	
	public String delete(String id)
	{
		stfRepo.deleteById(id);
		return "Staff with id:" + id + "deleted successfully.";
	}

}
