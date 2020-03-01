package pvp.setterinjection.annotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import pvp.BaseClass;

@Component(value = "personSetterInjectionAnnotation")
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

	@Autowired
	public void setId(@Value("3") Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	@Autowired
	public void setFirstName(@Value("FirstNameSetterInjectionAnnotations") String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Autowired
	public void setLastName(@Value("LastNameSetterInjectionAnnotations") String lastName) {
		this.lastName = lastName;
	}

	public WorkPosition getWorkPosition() {
		return workPosition;
	}

	@Autowired
	public void setWorkPosition(WorkPosition workPosition) {
		this.workPosition = workPosition;
	}

}
