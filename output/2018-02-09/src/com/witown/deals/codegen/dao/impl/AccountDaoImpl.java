/*
 * AccountDaoImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.dao.impl;

import org.springframework.stereotype.Repository;

import com.witown.deals.dao.AccountDao;
import com.witown.deals.domain.Account;
/**
 * 类AccountDaoImpl的实现描述：wd_account-运营账户表
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Repository
public class AccountDaoImpl extends GenericDaoImpl<Long, Account> implements AccountDao  {
    @Override
    protected String getNamespace() {
        return "ACCOUNT";
    }


}