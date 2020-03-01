package pvp.setterinjection.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pvp.JavaConfigurationBaseClass;

@Configuration
@ComponentScan(basePackages = { "pvp.setterinjection.annotations" })
public class SetterInjectionConfiguration extends JavaConfigurationBaseClass{

}
