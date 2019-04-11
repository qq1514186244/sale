package com.newer.service;

import com.newer.domain.People;

public interface PeopleService {
   int login(String username, String password,String pstate);
   People loginer(String username, String password,String pstate);
}
