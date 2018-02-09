package com.witown.deals.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.witown.deals.dao.TestCaseBase;
import com.witown.deals.domain.Account;
import com.witown.deals.service.AccountService;
/**
 * 类AccountServiceTest.java的实现描述：AccountService单元测试
 * @author  JianLin.Zhu 2018-02-09 15:01:57
 */
public class AccountServiceTest extends TestCaseBase {
    
    @Autowired
    private AccountService accountService;
    
    @Test
    public void load(){
        Account bean = accountService.load(1L);
        logger.debug("Account="+bean);
        Assert.assertTrue(bean!=null && bean.getAutoId() ==1L);
    } 
    
}