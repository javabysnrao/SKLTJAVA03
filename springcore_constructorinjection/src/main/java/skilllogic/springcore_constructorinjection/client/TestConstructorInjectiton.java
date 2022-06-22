package skilllogic.springcore_constructorinjection.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import skilllogic.springcore_constructorinjection.beans.Student;

public class TestConstructorInjectiton {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("/skilllogic/springcore_constructorinjection/cfg/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Student st = (Student)factory.getBean("st");
		st.displayStudent();
	}
}
