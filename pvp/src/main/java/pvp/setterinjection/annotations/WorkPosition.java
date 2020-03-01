package pvp.setterinjection.annotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("workPositionSetterInjectionAnnotations")
public class WorkPosition {

	private Logger log = LoggerFactory.getLogger(WorkPosition.class);

	private Long id;
	private String name;

	public WorkPosition() {
		log.info("WorkPosition bean for Setter Injection created");
	}

	public long getId() {
		return id;
	}

	@Autowired
	public void setId(@Value("3") Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Autowired
	public void setName(@Value("Setter Injection Annotations Developer") String name) {
		this.name = name;
	}
}
