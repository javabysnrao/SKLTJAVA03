package skilllogic.springcore_setterandconstructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import skilllogic.springcore_setterandconstructorinjection.beans.Employee;

public class Test {
    public static void main( String[] args ){
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("skilllogic/springcore_setterandconstructorinjection/cfg/applicationContext.xml");
		/* DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		 XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("skilllogic/springcore_setterandconstructorinjection/cfg/applicationContext.xml");*/
    	  Employee employee1 =(Employee)ctx.getBean("emp");
    	  employee1.display();
    }
}
