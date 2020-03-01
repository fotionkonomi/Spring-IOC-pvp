package pvp.constructorInjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pvp.InjectionService;
import pvp.constructorInjection.annotations.ConstructorInjectionConfiguration;
import pvp.constructorInjection.confusion.PersonConfusionConstructor;
import pvp.constructorInjection.confusion.PersonConfusionConstructorAnnotation;

@RestController
@RequestMapping("/constructorInjection")
public class ConstructorInjectionController {

	@GetMapping("/constructorArgs")
	public Person getPersonWithConstructorArgs() {
		return InjectionService.getObjectFromXmlFile("app-context-constructor-injection.xml", "personConstructorArg", Person.class);
	}
	
	@GetMapping("/cNamespace")
	public Person getPersonWithCNamespace() {
		return InjectionService.getObjectFromXmlFile("app-context-constructor-injection.xml", "personCNamespace", Person.class);
	}
	
	@GetMapping("/annotations")
	public pvp.constructorInjection.annotations.Person getPersonWithAnnotations() {
		return InjectionService.getObjectFromJavaConfiguration(ConstructorInjectionConfiguration.class, "person", pvp.constructorInjection.annotations.Person.class);
	}
	
	@GetMapping("/constructorConfusion/default")
	public PersonConfusionConstructor getConfusionConstructorDefault() {
		return InjectionService.getObjectFromXmlFile("app-context-constructor-injection.xml", "constructorConfusionDefault", PersonConfusionConstructor.class);
	}
	
	@GetMapping("/constructorConfusion/string")
	public PersonConfusionConstructor getConfusionConstructorString() {
		return InjectionService.getObjectFromXmlFile("app-context-constructor-injection.xml", "constructorConfusionString", PersonConfusionConstructor.class);
	}
	
	@GetMapping("/constructorConfusion/int")
	public PersonConfusionConstructor getConfusionConstructorInt() {
		return InjectionService.getObjectFromXmlFile("app-context-constructor-injection.xml", "constructorConfusionInt", PersonConfusionConstructor.class);
	}
	
	@GetMapping("/constructorConfusion/annotation")
	public PersonConfusionConstructorAnnotation getConfusionConstructorAnnotation() {
		return InjectionService.getObjectFromXmlFile("app-context-constructor-injection.xml", "personConfusionConstructorAnnotation", PersonConfusionConstructorAnnotation.class);
	}
}
