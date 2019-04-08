package com.newer.service;

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
}
