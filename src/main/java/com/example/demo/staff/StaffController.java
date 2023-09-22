package com.example.demo.staff;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {
	
	@Autowired
	public StaffService service;
	
	@PostMapping("/staff")
	public Staff createStaff(@Validated @RequestBody Staff stf)
	{
		return service.create(stf);
	}
	
	@GetMapping("/staffs")
	public List<Staff> getAllStaffs()
	{
		return service.getAll();
	}
	
	@GetMapping("/staff/{id}")
	public Optional<Staff> getStaffById(@PathVariable String id)
	{
		return service.getById(id);
	}
	
	@PutMapping("/staff/{id}")
	public Staff updateStaff(@PathVariable String id, @Validated @RequestBody Staff stf)
	{
		return service.update(id,stf);
	}
	
	@DeleteMapping("/staff/{id}")
	public String deleteStaff(@PathVariable String id)
	{
		service.delete(id);
		return "Staff with id:" + id + "deleted successfully.";
	}
}
