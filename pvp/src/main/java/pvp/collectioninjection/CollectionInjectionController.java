package pvp.collectioninjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pvp.InjectionService;

@RestController
@RequestMapping("/collectionInjection")
public class CollectionInjectionController {

	@GetMapping
	public CollectionInjectionBean getCollectionInjectionBean() {
		return InjectionService.getObjectFromXmlFile("app-context-collection-injection.xml", "collectionInjectionBean",
				CollectionInjectionBean.class);
	}
}
