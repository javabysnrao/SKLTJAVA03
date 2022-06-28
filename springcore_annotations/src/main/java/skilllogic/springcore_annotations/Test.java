package skilllogic.springcore_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import skilllogic.springcore_annotations.beans.Employee;
import skilllogic.springcore_annotations.config.AppConfig;
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e = ctx.getBean("emp",Employee.class);
		e.display();
	}
}
