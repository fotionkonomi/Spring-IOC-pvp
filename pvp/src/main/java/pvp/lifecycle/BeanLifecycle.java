package pvp.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import pvp.BaseClass;

public class BeanLifecycle extends BaseClass implements InitializingBean, DisposableBean {

	private Logger log = LoggerFactory.getLogger(BeanLifecycle.class);

	private Dependency lazyLoadedDependency = new Dependency(3L, "Default One");

	private Dependency requiredDependency;

	public BeanLifecycle(Dependency requiredDependency) {
		this.requiredDependency = requiredDependency;
		log.info("Bean Lifecycle Object Created by injecting the required Dependency");
	}

	public Dependency getLazyLoadedDependency() {
		return lazyLoadedDependency;
	}

	public void setLazyLoadedDependency(Dependency lazyLoadedDependency) {
		log.info("LazyLoadedDependency INJECTED");
		this.lazyLoadedDependency = lazyLoadedDependency;
	}

	public Dependency getRequiredDependency() {
		return requiredDependency;
	}

	public void setRequiredDependency(Dependency requiredDependency) {
		this.requiredDependency = requiredDependency;
	}

	@PostConstruct
	public void init() {
		log.info("@PostConstruct Method Called");
		checkProperties();
	}

	@PreDestroy
	public void preDestroy() {
		log.info("@PreDestroy Method Called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("afterPropertiesSet() Method of InitializingBean interface called");
		checkProperties();
	}

	@Override
	public void destroy() throws Exception {
		log.info("destroy() Method of DisposableBean interface Called");
	}

	public void initMethod() {
		log.info("init-method Method Called");
		checkProperties();
	}

	public void destroyMethod() {
		log.info("destroy-method Method Called");
	}

	private void checkProperties() {
		log.info("Required Dependency: " + this.requiredDependency);
		log.info("Lazy Loaded Dependency: " + this.lazyLoadedDependency);

	}

}
