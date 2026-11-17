package java_based_config;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.Employee;
import test.Student;

public class Driver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
		Student s = (Student)context.getBean("student");
		System.out.println(s);
		
//		Employee e = (Employee)context.getBean("employee");
//		System.out.println(e);
	}
}	
