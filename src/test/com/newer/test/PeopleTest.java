package com.newer.test;

import com.newer.domain.DispatchbillItem;
import com.newer.service.DispatchBillService;
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

    @Test
    public void test2(){

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        DispatchBillService dispatchBillService =ctx.getBean("dispatchBillServiceImpl", DispatchBillService.class);
        dispatchBillService.fahuoqinqiu(3).forEach(d->{
            System.out.println(d.getDrugItem().getDrug().getDname()+d.getDrugItem().getDiquantity()+d.getDrugItem().getDisumprice()+
                    d.getDrugItem().getDrugList().getClinic().getCaddress()+d.getDrugItem().getDrugList().getClinic().getCname());
        });


    }
}
