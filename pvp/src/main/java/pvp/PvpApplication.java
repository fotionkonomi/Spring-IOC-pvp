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
	}
	
	private String urlForConstructorInjectionWithXmlConstructorArgs() {
		return "http://localhost:8080/constructorInjection/constructorArgs";
	}
	
	private String urlForConstructorInjectionWithXmlCNameSpace() {
		return "http://localhost:8080/constructorInjection/cNamespace";
	}

}
