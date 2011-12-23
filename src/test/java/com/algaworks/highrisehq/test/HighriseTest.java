package com.algaworks.highrisehq.test;

import java.util.Date;
import java.util.List;

import com.algaworks.highrisehq.Highrise;
import com.algaworks.highrisehq.bean.EmailAddress;
import com.algaworks.highrisehq.bean.Note;
import com.algaworks.highrisehq.bean.Person;
import com.algaworks.highrisehq.bean.PhoneNumber;
import com.algaworks.highrisehq.bean.Task;

public class HighriseTest {

	public static void main(String[] args) {
		// if your URL is http://algaworks.highrisehq.com and your token 12345, use:
		 Highrise highrise = new Highrise("algaworks", "12345");
		
		// creates a person
		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Doe");
		person.setBackground("A good person.");
		person.getContactData().addEmailAddress(new EmailAddress("john.doe.123@gmail.com", "Home"));
		person.getContactData().addEmailAddress(new EmailAddress("johnjohn@hotmail.com", "Home"));
		person.getContactData().addPhoneNumber(new PhoneNumber("55 34 1234-5678", "Work"));
		person = highrise.getPeopleManager().create(person);
                
		// creates a note for John Doe
		Note note = new Note();
		note.setBody("I told him a joke.");
		note.setSubjectId(person.getId());
		note.setSubjectType(Highrise.SubjectType.PARTY);
		highrise.getNoteManager().create(note);
		
		// creates a task for John Doe
		Task task = new Task();
		task.setBody("Call him and tell another joke");
		task.setOwnerId(0L); // the owner id (check it in Highrise)
		task.setCategoryId(0L); // the category id (check it in Highrise)
		task.setPublic(true);
		task.setSubjectType(Highrise.SubjectType.PARTY);
		task.setSubjectId(person.getId());
		task.setFrame("specific");
		task.setDueAt(new Date());
		highrise.getTaskManager().create(task);

		// search for John Doe using his email
		List<Person> people = highrise.getPeopleManager().searchByCriteria(null, null, null, null, null, "john.doe.123@gmail.com");
		
		for (Person p : people) {
			System.out.println(p.getFirstName());
		}
	}
	
}