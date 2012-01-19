/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.highrisehq.managers;

import com.algaworks.highrisehq.Highrise;
import com.algaworks.highrisehq.bean.Companies;
import com.algaworks.highrisehq.bean.Company;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import java.util.List;
import javax.ws.rs.core.MultivaluedMap;

/**
 *
 * @author duncan
 */
public class CompanyManager extends HighriseManager {

    public CompanyManager(WebResource webResource, String authorization) {
            super(webResource, authorization);
    }
       
    public Company create(Company company) {
            return this.create(company, Highrise.COMPANY_PATH);
    }  
    
    public List<Company> getAll(Long offset) {
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("n", offset.toString());
        return this.getAsList(Company.class, Companies.class, Highrise.COMPANY_PATH, params);
    }
    
    public List<Company> searchByCriteria(String basisid, String state, String country, String zip, String phone, String email) {
            MultivaluedMap<String, String> params = new MultivaluedMapImpl();
            if (basisid != null && !basisid.trim().equals("")) {
                    params.add("criteria[basisid]", basisid);
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

            return this.getAsList(Company.class, Companies.class, Highrise.COMPANY_SEARCH_PATH, params);
    }    
    public void update(Company company) {        
        this.update(company, Highrise.COMPANY_UPDATE_PATH.replaceAll("#\\{id\\}", company.getId().toString()));
    }

    public List<Company> searchByCustomField(String customField, String value, Long offset) {
            MultivaluedMap<String, String> params = new MultivaluedMapImpl();
            params.add("n", offset.toString());
            if (customField != null && !customField.trim().equals("") && value != null) {
                params.add("criteria["+ customField +"]", value);
            }
            return this.getAsList(Company.class, Companies.class, Highrise.COMPANY_SEARCH_PATH, params);        
    }

    public void destroy(Company company) {
        this.remove(Highrise.COMPANY_UPDATE_PATH.replaceAll("#\\{id\\}", company.getId().toString()));        
    }
}
