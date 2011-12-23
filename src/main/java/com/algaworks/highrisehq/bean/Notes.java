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
@XmlRootElement(name="notes")
public class Notes implements Serializable, ListWrapper<Note> {
    
    private List<Note> notes;

    @Override
    @XmlElement(name="note")    
    public List<Note> getObjects() {
        return notes;
    }

    @Override
    public void setObjects(List<Note> objects) {
        this.notes = objects;
    }
    
}
