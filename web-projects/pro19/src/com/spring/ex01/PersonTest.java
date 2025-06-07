package com.spring.ex01;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
        PersonService person = (PersonService) factory.getBean("personService");
        // PersonService person = new PersonServiceImpl();
        person.sayHello();
    }

}