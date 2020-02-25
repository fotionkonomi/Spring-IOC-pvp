package pvp.constructorInjection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pvp.InjectionService;

@RestController
@RequestMapping("/constructorInjection")
public class Controller {

	@RequestMapping()
	public Person getPerson() {
		return InjectionService.getObjectFromXmlFile("app-context-constructor-injection.xml", "person", Person.class);
	}
}
