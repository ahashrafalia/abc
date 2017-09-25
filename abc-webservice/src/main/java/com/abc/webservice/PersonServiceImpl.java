package com.abc.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.abc.core.IPerson;
import com.abc.core.Person;
import com.abc.integration.PersonDAO;
import com.abc.integration.PersonDAOImpl;

@WebService(targetNamespace = "http://webservice.abc.com/", portName = "PersonServiceImplPort", serviceName = "PersonServiceImplService")
public class PersonServiceImpl extends SpringBeanAutowiringSupport implements IPerson {

	
	@Autowired
    private PersonDAO personDAO;
	
	@Autowired
	private PersonDao2 personDao2;
	
	@WebMethod(operationName = "addPerson", action = "urn:AddPerson")
	@Override
	public void addPerson(@WebParam(name = "arg0") Person p) {
		//PersonDAO personDAO=new PersonDAOImpl();
		System.out.println("personDao2="+personDao2);
		System.out.println("personDao="+personDAO);
		personDAO.addPerson(p);

	}

	@WebMethod(operationName = "updatePerson", action = "urn:UpdatePerson")
	@Override
	public void updatePerson(@WebParam(name = "arg0") Person p) {
		// TODO Auto-generated method stub

	}

	@WebMethod(operationName = "listPersons", action = "urn:ListPersons")
	@Override
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		return personDAO.listPersons();
	}

	@WebMethod(operationName = "getPersonById", action = "urn:GetPersonById")
	@Override
	public Person getPersonById(@WebParam(name = "arg0") int id) {
		// TODO Auto-generated method stub
		return personDAO.getPersonById(id);
	}

	@WebMethod(operationName = "removePerson", action = "urn:RemovePerson")
	@Override
	public void removePerson(@WebParam(name = "arg0") int id) {
		// TODO Auto-generated method stub

	}

}
