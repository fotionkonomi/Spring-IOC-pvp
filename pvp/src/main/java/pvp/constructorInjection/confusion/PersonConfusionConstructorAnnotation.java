package pvp.constructorInjection.confusion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import pvp.BaseClass;

@Component
public class PersonConfusionConstructorAnnotation extends BaseClass {

	private Logger log = LoggerFactory.getLogger(PersonConfusionConstructorAnnotation.class);
	
	private String age;
	
	public PersonConfusionConstructorAnnotation(@Value("100")String age) {
		log.info("PersonConfusionConstructorAnnotation(String) called");
		this.age = age;
	}
	
	@Autowired
	public PersonConfusionConstructorAnnotation(@Value("100")int age) {
		log.info("PersonConfusionConstructorAnnotation(int) called");
		this.age = Integer.toString(age);
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
}
