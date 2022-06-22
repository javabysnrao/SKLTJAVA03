package com.skilllogic.springcore_dependencyinjection.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import com.skilllogic.springcore_dependencyinjection.beans.Student;

public class TestDependencyInjection {

	public static void main(String[] args) {
		//Load xml file
		ClassPathResource res = new ClassPathResource("/com/skilllogic/springcore_dependencyinjection/cfg/applicationContext.xml");
		//Activate Container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Object obj = factory.getBean("st");//bean id of target class(getting target object)
		Student st = (Student)obj;
		st.displayStudent();//calling business method
	}
}
