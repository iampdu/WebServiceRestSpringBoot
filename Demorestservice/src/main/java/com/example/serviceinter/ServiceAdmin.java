package com.example.serviceinter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Admin;
import com.example.reposit.AdminRepository;

@Service
public class ServiceAdmin {
	
	@Autowired
	private AdminRepository daoInt;
	
	public Admin createAdmin(Admin ad)
	{
		
		return daoInt.save(ad);
	}
	
	public List<Admin>shoAllAdmin()
	{
	return (List<Admin>) daoInt.findAll();	
	}

}
