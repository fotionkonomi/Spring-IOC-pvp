package pvp.inheritance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pvp.InjectionService;

@RestController
@RequestMapping("/beanInheritance")
public class BeanInheritanceController {

	@GetMapping("/parent")
	public Person getParent() {
		return InjectionService.getObjectFromXmlFile("app-context-bean-inheritance.xml", "parentPerson", Person.class);
	}
	
	@GetMapping("/child")
	public Person getChild() {
		return InjectionService.getObjectFromXmlFile("app-context-bean-inheritance.xml", "childPerson", Person.class);
	}
}
