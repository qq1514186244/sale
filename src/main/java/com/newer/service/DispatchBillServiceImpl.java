package com.newer.service;

import com.newer.domain.Dispatchbill;
import com.newer.domain.DispatchbillItem;
import com.newer.mapper.DispatchBillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispatchBillServiceImpl implements  DispatchBillService{
    @Autowired
    private DispatchBillMapper dispatchBillMapper;

    @Override
    public List<DispatchbillItem> fahuoqinqiu(int pid) {
        return dispatchBillMapper.fahuoqinqiu(pid);
    }

    @Override
    public int findsid(int pid) {
        return dispatchBillMapper.findsid(pid);
    }

    @Override
    public int createfhd(int sid) {
        return dispatchBillMapper.createfhd(sid);
    }

    @Override
    public List<Dispatchbill> findAll(int sid) {
        return dispatchBillMapper.findAll(sid);
    }

    @Override
    public int adddbi(int dbid, int diid, int dbquantity) {
        return dispatchBillMapper.adddbi(dbid, diid, dbquantity);
    }
}
