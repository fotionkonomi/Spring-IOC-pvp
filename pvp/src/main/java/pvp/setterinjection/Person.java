package pvp.setterinjection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pvp.BaseClass;

public class Person extends BaseClass {

	private Logger log = LoggerFactory.getLogger(Person.class);
	
	private Long id;
	private String firstName;
	private String lastName;
	private WorkPosition workPosition;
	
	public Person() {
		log.info("Person bean created for setter injection");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public WorkPosition getWorkPosition() {
		return workPosition;
	}

	public void setWorkPosition(WorkPosition workPosition) {
		this.workPosition = workPosition;
	}
}
