package pvp.constructorInjection.confusion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pvp.BaseClass;

public class PersonConfusionConstructor extends BaseClass {

	private Logger log = LoggerFactory.getLogger(PersonConfusionConstructor.class);

	private String age;

	public PersonConfusionConstructor(String age) {
		log.info("String constructor called");
		this.age = age;
	}

	public PersonConfusionConstructor(int age) {
		log.info("Int constructor called");
		this.age = Integer.toString(age);
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
