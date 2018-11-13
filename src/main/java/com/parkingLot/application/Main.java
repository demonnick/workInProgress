package com.parkingLot.application;


import com.parkingLot.dao.TicketDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TicketDao dao = ctx.getBean("TicketDao",TicketDao.class);



        String twelve = "twelve";
        Ticket ticket = dao.getTicket(1,twelve,twelve,false);

    }
}
