package bean_initilization_Lazy_Annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Lazy
public class School {
	
	@PostConstruct
	public void init() {
		System.out.println("school is created");
	}
	
}
