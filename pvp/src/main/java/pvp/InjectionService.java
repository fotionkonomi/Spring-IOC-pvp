package pvp;

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
}
