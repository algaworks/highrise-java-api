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
    
	private static final long serialVersionUID = 1L;
	
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
