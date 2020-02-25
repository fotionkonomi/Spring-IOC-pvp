package pvp.constructorInjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pvp.InjectionService;

@RestController
@RequestMapping("/constructorInjection")
public class Controller {

	@GetMapping("/constructorArgs")
	public Person getPersonWithConstructorArgs() {
		return InjectionService.getObjectFromXmlFile("app-context-constructor-injection.xml", "personConstructorArg", Person.class);
	}
	
	@GetMapping("/cNamespace")
	public Person getPersonWithCNamespace() {
		return InjectionService.getObjectFromXmlFile("app-context-constructor-injection.xml", "personCNamespace", Person.class);
	}
}
