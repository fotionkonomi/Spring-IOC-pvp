package pvp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectionService<T extends BaseClass> {

	public static <T> T getObjectFromXmlFile(String fileName, String beanName, Class<T> classType) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:/" + fileName );
		ctx.refresh();
		T bean = ctx.getBean(beanName, classType);
		ctx.close();
		return bean;
	}
	
	public static <T> T getObjectFromJavaConfiguration(Class<? extends JavaConfigurationBaseClass> configurationClass, String name, Class<T> beanClass) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(configurationClass);
		return ctx.getBean(name, beanClass);
	
	}
	
	
}
