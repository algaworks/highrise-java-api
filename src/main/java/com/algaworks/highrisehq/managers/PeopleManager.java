package com.algaworks.highrisehq.managers;

import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

import com.algaworks.highrisehq.Highrise;
import com.algaworks.highrisehq.bean.People;
import com.algaworks.highrisehq.bean.Person;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class PeopleManager extends HighriseManager {

	public PeopleManager(WebResource webResource, String authorization) {
		super(webResource, authorization);
	}
        
	public List<Person> getAll(Long offset) {
            MultivaluedMap<String, String> params = new MultivaluedMapImpl();
            params.add("n", offset.toString());
            return this.getAsList(Person.class, People.class, Highrise.PEOPLE_PATH, params);
        }
        
	public List<Person> searchByCriteria(String city, String state, String country, String zip, String phone, String email) {
		MultivaluedMap<String, String> params = new MultivaluedMapImpl();
		if (city != null && !city.trim().equals("")) {
			params.add("criteria[city]", city);
		}
		if (state != null && !state.trim().equals("")) {
			params.add("criteria[state]", state);
		}
		if (country != null && !country.trim().equals("")) {
			params.add("criteria[country]", country);
		}
		if (zip != null && !zip.trim().equals("")) {
			params.add("criteria[zip]", zip);
		}
		if (phone != null && !phone.trim().equals("")) {
			params.add("criteria[phone]", phone);
		}
		if (email != null && !email.trim().equals("")) {
			params.add("criteria[email]", email);
		}
		
		return this.getAsList(Person.class, People.class, Highrise.PEOPLE_SEARCH_PATH, params);
	}
	
        public List<Person> searchByCustomField(String customField, String value){
            MultivaluedMap<String, String> params = new MultivaluedMapImpl();
            if (customField != null && !customField.trim().equals("") && value != null) {
                params.add("criteria["+ customField +"]", value);
            }
            return this.getAsList(Person.class, People.class, Highrise.PEOPLE_SEARCH_PATH, params);
        }
        
	public Person create(Person person) {
		return this.create(person, Highrise.PEOPLE_PATH);
	}
	
	public void update(Person person) {
		this.update(person, Highrise.PEOPLE_UPDATE_PATH.replaceAll("#\\{id\\}", person.getId().toString()));
	}
	
}