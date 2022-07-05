package skilllogic.springcore_annotations;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import skilllogic.springcore_annotations.beans.Employee;
import skilllogic.springcore_annotations.config.AppConfig;
public class Test {
	private static final Logger LOGGER = Logger.getLogger(Test.class.getClass());
	public static void main(String[] args) {
		LOGGER.info("main method started....");
		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e = ctx.getBean("emp",Employee.class);
		e.display();
	}
}
