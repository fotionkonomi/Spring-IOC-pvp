package pvp;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PvpApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(PvpApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PvpApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--------APPLICATION HAS STARTED-------------");
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		log.info("Constructor Args Constructor Injection: " + restTemplate.exchange(urlForConstructorInjectionWithXmlConstructorArgs(), HttpMethod.GET, entity, String.class).getBody());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		log.info("CNamespace: " + restTemplate.exchange(urlForConstructorInjectionWithXmlCNameSpace(), HttpMethod.GET, entity, String.class).getBody() );
		System.out.println("--------------------------------------------------------------------------------------------------------");
		log.info("Annotations: " + restTemplate.exchange(urlForConstructorInjectWithAnnotations(), HttpMethod.GET, entity, String.class).getBody() );
		System.out.println("--------------------------------------------------------------------------------------------------------");
		log.info("ConstructorConfusionDefault: " + restTemplate.exchange(urlForConstructorConfustionDefault(), HttpMethod.GET, entity, String.class).getBody() );
		System.out.println("--------------------------------------------------------------------------------------------------------");
		log.info("ConstructorConfusionString: " + restTemplate.exchange(urlForConstructorConfustionString(), HttpMethod.GET, entity, String.class).getBody() );
		System.out.println("--------------------------------------------------------------------------------------------------------");
		log.info("ConstructorConfusionInt: " + restTemplate.exchange(urlForConstructorConfustionInt(), HttpMethod.GET, entity, String.class).getBody() );
		System.out.println("--------------------------------------------------------------------------------------------------------");
		log.info("ConstructorConfusionAnnotation: " + restTemplate.exchange(urlForConstructorConfusionAnnotation(), HttpMethod.GET, entity, String.class).getBody());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		log.info("SetterInjectionPropertyTag: " + restTemplate.exchange(urlForSetterInjectionPropertyTag(), HttpMethod.GET, entity, String.class).getBody());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		log.info("SetterInjectionPNamespace:" + restTemplate.exchange(urlForSetterInjectionPNamespace(), HttpMethod.GET, entity, String.class).getBody());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		log.info("setterInjectionAnnotations:" + restTemplate.exchange(urlForSetterInjectionAnnotations(), HttpMethod.GET, entity, String.class).getBody());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		log.info("setterInjectionRequiredAnnotation:" + restTemplate.exchange(urlForSetterInjectionWithRequiredAnnotation(), HttpMethod.GET, entity, String.class).getBody());
	}
	
	private String urlForConstructorInjectionWithXmlConstructorArgs() {
		return "http://localhost:8080/constructorInjection/constructorArgs";
	}
	
	private String urlForConstructorInjectionWithXmlCNameSpace() {
		return "http://localhost:8080/constructorInjection/cNamespace";
	}
	
	private String urlForConstructorInjectWithAnnotations() {
		return "http://localhost:8080/constructorInjection/annotations";
	}
	
	private String urlForConstructorConfustionDefault() {
		return "http://localhost:8080/constructorInjection/constructorConfusion/default";
	}
	
	private String urlForConstructorConfustionString() {
		return "http://localhost:8080/constructorInjection/constructorConfusion/string";
	}
	
	private String urlForConstructorConfustionInt() {
		return "http://localhost:8080/constructorInjection/constructorConfusion/int";
	}
	
	private String urlForConstructorConfusionAnnotation() {
		return "http://localhost:8080/constructorInjection/constructorConfusion/annotation";
	}
	
	private String urlForSetterInjectionPropertyTag() {
		return "http://localhost:8080/setterInjection/propertyTag";
	}
	
	private String urlForSetterInjectionPNamespace() {
		return "http://localhost:8080/setterInjection/pNamespace";
	}
	
	private String urlForSetterInjectionAnnotations() {
		return "http://localhost:8080/setterInjection/annotations";
	}
	
	private String urlForSetterInjectionWithRequiredAnnotation() {
		return "http://localhost:8080/setterInjection/annotations/required";
	}

}
