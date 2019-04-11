package com.newer.controller;


import com.newer.domain.Clinic;
import com.newer.domain.Drug;
import com.newer.domain.DrugList;
import com.newer.domain.Supplier;
import com.newer.service.DerpatmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}
