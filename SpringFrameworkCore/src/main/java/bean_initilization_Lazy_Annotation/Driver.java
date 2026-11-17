package bean_initilization_Lazy_Annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Driver {
	
public static void main(String[] args) {
		
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
		School school = (School) con.getBean("school");
		System.out.println(school);
	}
}
