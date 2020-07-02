package com.lec.sts15_mybatis.ticket;

public class ITicketDAO {

	int insertCard(String userId,int buyAmount);
	int inserTicket(String userId,int ticketCount);
	int insertTicket(String Id, int ticketCount);
}
