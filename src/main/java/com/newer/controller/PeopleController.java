package com.newer.controller;

import com.newer.domain.Dispatchbill;
import com.newer.domain.DispatchbillItem;
import com.newer.domain.People;
import com.newer.service.DispatchBillService;
import com.newer.service.PeopleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
public class PeopleController {

    @Autowired
    private PeopleService peopleService;
    @Autowired
    private DispatchBillService dispatchBillService;

    @RequestMapping("login111")
    public boolean login(@RequestParam("username")String username,
                         @RequestParam("password")String password,
                         @RequestParam("pstate")String pstate, HttpSession session){

       int count= peopleService.login(username, password, pstate);
        People people=peopleService.loginer(username, password, pstate);

       if (count==1){
           session.setAttribute("people",people);
           return true;
       }else {
           return false;
       }

    }

    @RequestMapping("loginer")
    public People loginer(HttpSession session){
        People people= (People) session.getAttribute("people");
        return people;
    }

    @RequestMapping("exit")
    public String exit(HttpSession session){
        session.removeAttribute("people");
        return "1";
    }

    @RequestMapping("updatepwd")
    public String changepwd(){

        return "1";
    }

    @RequestMapping("fahuoqinqiu")
    public List<DispatchbillItem> fahuoqinqiu(int pid){
       List<DispatchbillItem> list=  dispatchBillService.fahuoqinqiu(pid);
       return list;
    }

    @RequestMapping("findsid")
    public int findsid(int pid){
        int sid=dispatchBillService.findsid(pid);
        dispatchBillService.createfhd(sid);
        return sid;
    }

    @RequestMapping("createfhd")
    public int createfhd(int sid){
        int dispatchbill=dispatchBillService.createfhd(sid);
        return dispatchbill;
    }
    @RequestMapping("findAllfhd")
    public List<Dispatchbill> findAllfhd(int sid){
        List<Dispatchbill>list=dispatchBillService.findAll(sid);
        return list;
    }

    @RequestMapping("adddbi")
    public int adddbi(int dbid,int diid,int dbiquantity){
        int count=dispatchBillService.adddbi(dbid, diid, dbiquantity);
        return count;
    }
}
