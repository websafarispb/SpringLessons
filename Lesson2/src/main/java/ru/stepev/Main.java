package ru.stepev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!!!");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        MyBean myBean = context.getBean("myBean",MyBean.class);
        System.out.println(testBean.getName());
        System.out.println(myBean.getName() + " | " + myBean.getValue());
    }
}
