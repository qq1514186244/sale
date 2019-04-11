package com.newer.service;

import com.newer.domain.*;
import com.newer.mapper.DerpatmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class DerpatmentServiceImpl implements DerpatmentService {

    @Autowired
    private DerpatmentMapper derpatmentMapper;
    @Override
    public List<Clinic> findAllClinic(int dpid) {
        return derpatmentMapper.findAllClinic(dpid);
    }

    @Override
    public List<DrugList> findAllDrugList(int cid) {
        return derpatmentMapper.findAllDrugList(cid);
    }

    @Override
    public List<Supplier> findAllSupplier() {
        return derpatmentMapper.findAllSupplier();
    }

    @Override
    public List<Drug> findAllDrug(int sid) {
        return derpatmentMapper.findAllDrug(sid);
    }

    @Override
    public List<Dispatchbill> findAllDispatchbill() {
        return derpatmentMapper.findAllDispatchbill();
    }

    @Override
    public List<Dispatchbill> findDispatchbill(String dbstate) {
        return derpatmentMapper.findDispatchbill(dbstate);
    }

    @Override
    public int updateDispatchbill(Dispatchbill dispatchbill) {
        return derpatmentMapper.updateDispatchbill(dispatchbill);
    }

    @Override
    public Dispatchbill findByDbid(int dbid) {
        return derpatmentMapper.findByDbid(dbid);
    }
}
