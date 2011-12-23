package com.algaworks.highrisehq.managers;

import com.algaworks.highrisehq.Highrise;
import com.algaworks.highrisehq.bean.Company;
import com.algaworks.highrisehq.bean.Note;
import com.algaworks.highrisehq.bean.Notes;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import java.util.List;
import javax.ws.rs.core.MultivaluedMap;

public class NoteManager extends HighriseManager {

	public NoteManager(WebResource webResource, String authorization) {
		super(webResource, authorization);
	}

	public Note create(Note note) {
		return this.create(note, Highrise.PEOPLE_NOTES_PATH
				.replaceAll("#\\{person-id\\}", note.getSubjectId().toString()));
	}
        
        public Note createDealNote(Note note){
            return this.create(note, "deals/1524744/notes.xml");
        }
        
        public Note createCompanyNote(Note note){
            return this.create(note, "companies/91239927/notes.xml");
        }
        
        public List<Note> getAll(Class subjectType, Long subjectId){
            MultivaluedMap<String, String> params = new MultivaluedMapImpl();

            if (subjectType.isAssignableFrom(Company.class)){
                return this.getAsList(Note.class, Notes.class, Highrise.COMPANY_NOTES_PATH.replaceAll("#\\{subject-id\\}", subjectId.toString()), params);
            } else {
                return this.getAsList(Note.class, Notes.class, Highrise.PEOPLE_NOTES_PATH.replaceAll("#\\{person-id\\}", subjectId.toString()), params);
            }
        }
	
}