package com.dankolyshkin.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
//        Person person2 = context.getBean("personBean", Person.class);
//        person.callYourPet();

        context.close();
    }
}