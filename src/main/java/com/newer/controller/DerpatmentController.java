package com.newer.controller;


import com.newer.domain.*;
import com.newer.service.DerpatmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/derpatment")
public class DerpatmentController {

    @Autowired
    private DerpatmentService derpatmentService;

    @GetMapping(value = "/clinic/{dpid}")
    public List<Clinic> findAllClinic(@PathVariable("dpid") int dpid){
        return derpatmentService.findAllClinic(dpid);
    }
    @GetMapping(value = "/drugList/{cid}")
    public List<DrugList> findAllDrugList(@PathVariable("cid") int cid){
        return derpatmentService.findAllDrugList(cid);
    }

    @GetMapping(value = "/supplier")
    public List<Supplier> findAllSupplier(){
        return derpatmentService.findAllSupplier();
    }

    @GetMapping(value = "/drug/{sid}")
    public List<Drug> findAllDrug(@PathVariable("sid") int sid){
        return derpatmentService.findAllDrug(sid);
    }

    @GetMapping(value = "/dispatchbill")
    public List<Dispatchbill>  findAllDispatchbill(){
        return derpatmentService.findAllDispatchbill();
    }

    @GetMapping(value = "/dispatchbill/{dbstate}")
    public List<Dispatchbill>  findDispatchbill(@PathVariable("dbstate") String dbstate){
        return derpatmentService.findDispatchbill(dbstate);
    }

    @PutMapping(value = "/dispatchbill/{dbid}")
    public Map<String,Object> updateDispatchbill(@PathVariable("dbid") int dbid, Dispatchbill dispatchbill){
        dispatchbill.setDbid(dbid);
        int result=derpatmentService.updateDispatchbill(dispatchbill);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }

    @GetMapping(value = "/findByDbid/{dbid}")
    public Dispatchbill findByDbid(@PathVariable("dbid") int dbid){
        return derpatmentService.findByDbid(dbid);
    }



}
