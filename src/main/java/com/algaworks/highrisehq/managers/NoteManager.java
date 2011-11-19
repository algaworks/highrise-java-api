package com.algaworks.highrisehq.managers;

import com.algaworks.highrisehq.Highrise;
import com.algaworks.highrisehq.bean.Note;
import com.sun.jersey.api.client.WebResource;

public class NoteManager extends HighriseManager {

	public NoteManager(WebResource webResource, String authorization) {
		super(webResource, authorization);
	}

	public Note create(Note note) {
		return this.create(note, Highrise.NOTES_PATH
				.replaceAll("#\\{person-id\\}", note.getSubjectId().toString()));
	}
	
}