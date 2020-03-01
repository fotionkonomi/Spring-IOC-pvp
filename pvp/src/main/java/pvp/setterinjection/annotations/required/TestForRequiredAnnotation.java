package pvp.setterinjection.annotations.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestForRequiredAnnotation {

	private String test1;
	
	private String test2;

	public String getTest1() {
		return test1;
	}

	@Autowired
	public void setTest1(@Value("test1") String test1) {
		this.test1 = test1;
	}

	public String getTest2() {
		return test2;
	}

	@Autowired
	@Required //Sduhet perdorur pasi per kete gje ekziston constructor injection
	public void setTest2(@Value("Test2 Required") String test2) {
		this.test2 = test2;
	}
	
	
}
