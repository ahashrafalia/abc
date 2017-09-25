package com.abc.integration;

import java.util.ArrayList;
import java.util.List;

import com.abc.core.Person;

public class PersonDAOImpl implements PersonDAO {
	
	List<Person> list=new ArrayList<Person>();

	@Override
	public void addPerson(Person p) {
		System.out.println("Addperson Dao invoide");
		Person p1=new Person();
		p1.setId(1);
		p1.setCountry("India");
		p1.setName("Ashraf");
		list.add(p1);
		System.out.println("list isze="+list.size());
	}

	@Override
	public void updatePerson(Person p) {
		System.out.println("Update person Dao invoide");
	}

	@Override
	public List<Person> listPersons() {
		System.out.println("Listperson Dao invoide");
		return list;
	}

	@Override
	public Person getPersonById(int id) {
		Person per=null;
		for(Person p:list){
			if(p.getId()==id){
				per= p;
			}
		}
		return per;
	}

	@Override
	public void removePerson(int id) {
		
	}

}
