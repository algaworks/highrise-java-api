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
}
