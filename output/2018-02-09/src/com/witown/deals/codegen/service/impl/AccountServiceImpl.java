/*
 * AccountServiceImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witown.deals.dao.GenericDao;
import com.witown.deals.dao.AccountDao;
import com.witown.deals.domain.Account;
import com.witown.deals.service.AccountService;
/**
 * 类AccountServiceImpl的实现描述：wd_account-运营账户表
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Service
public class AccountServiceImpl extends GenericServiceImpl<Long, Account> implements AccountService  {
    @Autowired
    private AccountDao      accountDao;

    @Override
    public GenericDao<Long, Account> getGenericDao() {
        return accountDao;
    }
    
}