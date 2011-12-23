/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.highrisehq.bean;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author duncan
 */
@XmlRootElement(name="companies")
public class Companies implements Serializable, ListWrapper<Company> {

    private static final long serialVersionUID = 1L;

    private List<Company> companies;

    @Override
    @XmlElement(name="company")
    public List<Company> getObjects() {
        return companies;
    }

    @Override
    public void setObjects(List<Company> objects) {
        this.companies = objects;
    }
        
}
