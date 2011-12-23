/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.highrisehq.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author duncan
 */
public class SubjectData implements Serializable {
    
    public static String BASISID = "524003";
    public static String INVESTOR = "524016";
    public static String HUISBANK = "524015";
    public static String MEDEWERKERCATEGORIE = "524022";
    public static String OMZETCATEGORIE = "524025";
    public static String OMZET = "524029";
    public static String OMVANG = "524008";
    public static String AFLOOPDATUM = "524007";
    
    private String value;
    private String name;
    private String label;

    public SubjectData() {}
    
    public SubjectData(String name, String value) {
        this.name = name;
        this.value = value;
    }
    

    @XmlElement(name="value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlElement(name="subject_field_id")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="subject_field_label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    
    @Override
    public String toString() {
        return "SubjectData{" + "value=" + value + ", name=" + name + ", label=" + label + '}';
    }

}
