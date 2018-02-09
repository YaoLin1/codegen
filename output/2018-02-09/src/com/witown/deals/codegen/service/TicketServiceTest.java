package com.witown.deals.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.witown.deals.dao.TestCaseBase;
import com.witown.deals.domain.Ticket;
import com.witown.deals.service.TicketService;
/**
 * 类TicketServiceTest.java的实现描述：TicketService单元测试
 * @author  JianLin.Zhu 2018-02-09 15:01:57
 */
public class TicketServiceTest extends TestCaseBase {
    
    @Autowired
    private TicketService ticketService;
    
    @Test
    public void load(){
        Ticket bean = ticketService.load(1L);
        logger.debug("Ticket="+bean);
        Assert.assertTrue(bean!=null && bean.getAutoId() ==1L);
    } 
    
}