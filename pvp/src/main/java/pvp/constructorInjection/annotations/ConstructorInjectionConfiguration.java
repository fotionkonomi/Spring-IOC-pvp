package pvp.constructorInjection.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pvp.JavaConfigurationBaseClass;

@Configuration
@ComponentScan(basePackages = { "pvp.constructorInjection.annotations" })
public class ConstructorInjectionConfiguration extends JavaConfigurationBaseClass {
	
	@Bean
	public WorkPosition workPosition() {
		return new WorkPosition(1, "Java Developer");
	}
}
