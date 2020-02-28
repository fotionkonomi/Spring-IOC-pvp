package pvp.constructorInjection;

import pvp.BaseClass;

public class Person extends BaseClass {

	private Long id;
	private String firstName;
	private String lastName;
	private WorkPosition workPosition; 
	
	public Person(Long id, String firstName, String lastName, WorkPosition workPosition) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.setWorkPosition(workPosition);
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
