package com.kuang.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService
@Component
public class TicketServiceImpl implements TicketService {

    public String getTicket() {
            return "车票";
    }
}