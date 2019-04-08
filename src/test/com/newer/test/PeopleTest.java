package com.newer.test;

import com.newer.service.PeopleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeopleTest {
    @Test
    public void test1(){

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        PeopleService peopleService=ctx.getBean("peopleServiceImpl", PeopleService.class);
        System.out.println(peopleService.login("bob123456","123456","3"));
    }
}
