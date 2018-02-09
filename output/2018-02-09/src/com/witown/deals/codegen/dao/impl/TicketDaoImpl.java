/*
 * TicketDaoImpl.java  Created On 2018-02-09
 * Copyright(c) 2015 Treebear Inc.
 * ALL Rights Reserved.
 */
package com.witown.deals.dao.impl;

import org.springframework.stereotype.Repository;

import com.witown.deals.dao.TicketDao;
import com.witown.deals.domain.Ticket;
/**
 * 类TicketDaoImpl的实现描述：wd_ticket-凭证
 * @author JianLin.Zhu 2018-02-09 15:01:57
 */
@Repository
public class TicketDaoImpl extends GenericDaoImpl<Long, Ticket> implements TicketDao  {
    @Override
    protected String getNamespace() {
        return "TICKET";
    }


}