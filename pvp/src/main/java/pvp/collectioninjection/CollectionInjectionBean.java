package pvp.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import pvp.BaseClass;

public class CollectionInjectionBean extends BaseClass {

	private List<Object> list;
	private Set<Object> set;
	private Properties props;
	private Map<String, Object> map;
	


	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

}
