/*
 * TicketServiceImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witown.deals.dao.GenericDao;
import com.witown.deals.dao.TicketDao;
import com.witown.deals.domain.Ticket;
import com.witown.deals.service.TicketService;
/**
 * 类TicketServiceImpl的实现描述：wd_ticket-凭证
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Service
public class TicketServiceImpl extends GenericServiceImpl<Long, Ticket> implements TicketService  {
    @Autowired
    private TicketDao      ticketDao;

    @Override
    public GenericDao<Long, Ticket> getGenericDao() {
        return ticketDao;
    }
    
}