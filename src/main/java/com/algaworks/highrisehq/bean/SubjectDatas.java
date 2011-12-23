/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.highrisehq.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author duncan
 */
public class SubjectDatas {
    
    private String type = "array";
    private List<SubjectData> datas = new ArrayList<SubjectData>();

    @XmlElement(name="subject_data")
    public List<SubjectData> getDatas() {
        return datas;
    }

    public void setDatas(List<SubjectData> datas) {
        this.datas = datas;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
