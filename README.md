Java API for Highrise - 37signals
---------------------------------
This library gives you access to Highrise API.
It's not supporting the full API, only some features are implemented, but feed free to contribute if you need a new feature.


Installation
------------
If you use Maven as your dependency manager, install this project into your local repository:

	mvn install

After that, include a dependency into your pom.xml:

	<dependency>
		<groupId>com.algaworks</groupId>
		<artifactId>highrise-java-api</artifactId>
		<version>1.0.0-SNAPSHOT</version>
	</dependency>


Usage example
-------------

Setup the API:

	// if your URL is http://algaworks.highrisehq.com and your token 12345, use:
	// Highrise api = new Highrise("algaworks", "12345");
	Highrise highrise = new Highrise("your_account_name_here", "your_token_here");
	
Create a new person:
	
	// creates a person
	Person person = new Person();
	person.setFirstName("John");
	person.setLastName("Doe");
	person.setBackground("A good person.");
	person.getContactData().addEmailAddress(new EmailAddress("john.doe.123@gmail.com", "Home"));
	person.getContactData().addEmailAddress(new EmailAddress("johnjohn@hotmail.com", "Home"));
	person.getContactData().addPhoneNumber(new PhoneNumber("55 34 1234-5678", "Work"));
	person = highrise.getPeopleManager().create(person);
	
Create a new note:
	
	// creates a note for John Doe
	Note note = new Note();
	note.setBody("I told him a joke.");
	note.setSubjectId(person.getId());
	note.setSubjectType("Party");
	highrise.getNoteManager().create(note);
	
Create a new task:
	
	// creates a task for John Doe
	Task task = new Task();
	task.setBody("Call him and tell another joke");
	task.setOwnerId(0L); // the owner id (check it in Highrise)
	task.setCategoryId(0L); // the category id (check it in Highrise)
	task.setPublic(true);
	task.setSubjectType("Party");
	task.setSubjectId(person.getId());
	task.setFrame("specific");
	task.setDueAt(new Date());
	highrise.getTaskManager().create(task);
	
Search people using criterias:
	
	// search for John Doe using his email
	List<Person> people = highrise.getPeopleManager().searchByCriteria(null, null, null, null, null, "john.doe.123@gmail.com");
	
	for (Person p : people) {
		System.out.println(p.getFirstName());
	}