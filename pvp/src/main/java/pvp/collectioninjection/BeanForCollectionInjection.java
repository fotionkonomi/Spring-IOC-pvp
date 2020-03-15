package pvp.collectioninjection;

import pvp.BaseClass;

public class BeanForCollectionInjection extends BaseClass {

	private String name;

	public BeanForCollectionInjection(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
