package com.ectrip.tourcard.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.ectrip.ticket.TicketServiceApi;

@FeignClient("ticket-service")
public interface TicketService extends TicketServiceApi{

}