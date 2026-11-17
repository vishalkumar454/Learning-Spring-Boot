package bean_initilization_Lazy_Annotation;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class College {

	@PostConstruct
	public void init() {
		System.out.println("college is created");
	}
}
