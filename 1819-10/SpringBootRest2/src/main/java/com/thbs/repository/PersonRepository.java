package com.thbs.repository;

import java.util.ArrayList;
import java.util.List;


import com.thbs.model.Person;



public class PersonRepository {

	List<Person> plist;
	
	public PersonRepository()
	{
		plist =new ArrayList<Person>();
		Person p1=new Person();
		p1.setId(5);
		p1.setName("Vikram");
		p1.setAge(45);
		
		Person p2=new Person();
		p2.setId(52);
		p2.setName("Vishal");
		p2.setAge(99);
		
		plist.add(p1);
		plist.add(p2);
		
		
	}
	public List<Person> getAllDetails()
	{
		return plist;
		
	}
	
}
