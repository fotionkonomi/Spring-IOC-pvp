package pvp.setterinjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pvp.InjectionService;
import pvp.setterinjection.annotations.SetterInjectionConfiguration;
import pvp.setterinjection.annotations.required.TestForRequiredAnnotation;

@RestController
@RequestMapping("/setterInjection")
public class SetterInjectionController {

	@GetMapping("/propertyTag")
	public Person getPersonWithSetterInjectionWithPropertyTag() {
		return InjectionService.getObjectFromXmlFile("app-context-setter-injection.xml", "personSetterPropertyTag",
				Person.class);
	}

	@GetMapping("/pNamespace")
	public Person getPersonWithSetterInjectionWithPNamespace() {
		return InjectionService.getObjectFromXmlFile("app-context-setter-injection.xml", "personSetterPNamespace",
				Person.class);
	}
	
	@GetMapping("/annotations")
	public pvp.setterinjection.annotations.Person getPersonWithSetterInjectionWithAnnotations() {
		return InjectionService.getObjectFromJavaConfiguration(SetterInjectionConfiguration.class,
				"personSetterInjectionAnnotation", pvp.setterinjection.annotations.Person.class);
	}
	
	@GetMapping("/annotations/required")
	public TestForRequiredAnnotation getTestForRequiredAnnotation() {
		return InjectionService.getObjectFromJavaConfiguration(SetterInjectionConfiguration.class, "testForRequiredAnnotation", TestForRequiredAnnotation.class);
	}
}
