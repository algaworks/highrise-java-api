/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.highrisehq.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author duncan
 */
@XmlRootElement(name="company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private SubjectDatas subjectDatas;

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @XmlElement(name="id")        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name="name") 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="subject_datas")
    public SubjectDatas getSubjectDatas() {
        return subjectDatas;
    }

    public void setSubjectDatas(SubjectDatas subjectDatas) {
        this.subjectDatas = subjectDatas;
    }

    
}
