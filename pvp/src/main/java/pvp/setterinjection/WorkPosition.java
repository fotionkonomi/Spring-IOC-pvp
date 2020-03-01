package pvp.setterinjection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pvp.BaseClass;

public class WorkPosition extends BaseClass {

	private Logger log = LoggerFactory.getLogger(WorkPosition.class);
	
	private Long id;
	private String name;
	
	public WorkPosition() {
		log.info("WorkPosition bean for Setter Injection created");
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
