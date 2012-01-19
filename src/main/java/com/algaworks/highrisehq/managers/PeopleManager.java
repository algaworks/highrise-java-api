package com.algaworks.highrisehq.managers;

import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

import com.algaworks.highrisehq.Highrise;
import com.algaworks.highrisehq.bean.People;
import com.algaworks.highrisehq.bean.Person;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PeopleManager extends HighriseManager {
    
    	private final static DateFormat yyyymmddhhMMss = new SimpleDateFormat("yyyyMMddHHmmss");
        
        static {
            yyyymmddhhMMss.setTimeZone(new SimpleTimeZone(0, "UTC"));
        }

	public PeopleManager(WebResource webResource, String authorization) {
		super(webResource, authorization);
	}
        
        public Person get(Long id){
            return this.show(Person.class, Highrise.PEOPLE_UPDATE_PATH.replaceAll("#\\{id\\}", id.toString()));
        }
        
	public List<Person> getAll(Long offset) {
            MultivaluedMap<String, String> params = new MultivaluedMapImpl();
            params.add("n", offset.toString());
            return this.getAsList(Person.class, People.class, Highrise.PEOPLE_PATH, params);
        }
        
        public List<Person> since(Date date, Long offset){
            MultivaluedMap<String, String> params = new MultivaluedMapImpl();
            params.add("since", yyyymmddhhMMss.format(date));            
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