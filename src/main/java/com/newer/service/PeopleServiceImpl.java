package com.newer.service;

import com.newer.domain.People;
import com.newer.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleMapper peopleMapper;
    @Override
    public int login(String username, String password,String pstate) {
        return peopleMapper.login(username, password,pstate);
    }

    @Override
    public People loginer(String username, String password, String pstate) {
        return peopleMapper.loginer(username, password, pstate);
    }
}
