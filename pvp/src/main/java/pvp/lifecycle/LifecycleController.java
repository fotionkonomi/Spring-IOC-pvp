package pvp.lifecycle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pvp.InjectionService;

@RestController
@RequestMapping("/lifecycle")
public class LifecycleController {

	@GetMapping
	public BeanLifecycle getBeanLifecycle() {
		return InjectionService.getObjectFromXmlFile("app-context-bean-lifecycle.xml", "beanLifecycle",
				BeanLifecycle.class);
	}
}
