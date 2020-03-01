package pvp.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pvp.BaseClass;

public class Dependency extends BaseClass {

	private Logger log = LoggerFactory.getLogger(Dependency.class);

	private Long id;
	private String name;

	public Dependency() {
		log.info("Dependency Bean Created");
	}

	public Dependency(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
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

	@Override
	public String toString() {
		return "Dependency [log=" + log + ", id=" + id + ", name=" + name + "]";
	}

}
