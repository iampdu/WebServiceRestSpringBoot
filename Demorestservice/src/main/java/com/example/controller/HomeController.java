package com.example.controller;

import java.util.List;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Admin;
import com.example.model.User;
import com.example.serviceinter.ServiceAdmin;
import com.example.serviceinter.ServiceUser;

@RestController
public class HomeController {
	
	@Autowired
	private ServiceAdmin person;
	
	@Autowired
	private ServiceUser serviceUser;
	
	@RequestMapping(value="/getp",method=RequestMethod.GET,produces =MediaType.TEXT_PLAIN_VALUE)
	public @ResponseBody String m1()
	{
		return"om";
	}
	
	@RequestMapping(value="/cad",method=RequestMethod.POST,produces =MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Admin createadmin(@RequestBody Admin ad)
	{	
		person.createAdmin(ad);
		return ad;
	}
	
	@RequestMapping(value="/showad",method=RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Admin> shoAllAdmin()
	{
		List<Admin> ad=(List<Admin>) person.shoAllAdmin();	
		return ad; 
	}
	
	
	@RequestMapping(value="/createUse",method=RequestMethod.POST,produces =MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User creatUser(@RequestBody User user)
	{	
		serviceUser.createUser(user);
		return user;
	}
	
	@RequestMapping(value="/showUse",method=RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<User> shoAllUser()
	{
		List<User> us=(List<User>) serviceUser.shoAllUser();	
		return us; 
	}
	

}
