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
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		log.info("Constructor Args Constructor Injection: " + restTemplate.exchange(urlForConstructorInjectionWithXmlConstructorArgs(), HttpMethod.GET, entity, String.class).getBody());
		log.info("CNamespace: " + restTemplate.exchange(urlForConstructorInjectionWithXmlCNameSpace(), HttpMethod.GET, entity, String.class).getBody() );
		log.info("Annotations: " + restTemplate.exchange(urlForConstructorInjectWithAnnotations(), HttpMethod.GET, entity, String.class).getBody() );
		log.info("ConstructorConfusionDefault: " + restTemplate.exchange(urlForConstructorConfustionDefault(), HttpMethod.GET, entity, String.class).getBody() );
		log.info("ConstructorConfusionString: " + restTemplate.exchange(urlForConstructorConfustionString(), HttpMethod.GET, entity, String.class).getBody() );
		log.info("ConstructorConfusionInt: " + restTemplate.exchange(urlForConstructorConfustionInt(), HttpMethod.GET, entity, String.class).getBody() );
		log.info("ConstructorConfusionAnnotation: " + restTemplate.exchange(urlForConstructorConfusionAnnotation(), HttpMethod.GET, entity, String.class).getBody());
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

}
