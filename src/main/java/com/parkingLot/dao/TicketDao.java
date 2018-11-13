package com.parkingLot.dao;

import com.parkingLot.application.Ticket;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class TicketDao {

    public Ticket getTicket(int ID, String TIME_IN, String TIME_OUT, boolean IS_LOST){

Ticket t = new Ticket();

    Connection conn = null;

        try {
        Class.forName("org.hsqldb.jdbcDriver").newInstance();
        conn= DriverManager.getConnection("jdbc:hsqldb:file:C:/Users/Nicolas/IdeaProjects/futureGadgetLaboratories/src/main/resources\\PARKING/");
        PreparedStatement p = conn.prepareStatement("SELECT * from PARKING where ID = 0"); //?
        //p.setInt(0, ID);



        ResultSet rs = p.executeQuery();

        rs.close();
        p.close();



    } catch (InstantiationException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (
    SQLException e) {
        e.printStackTrace();
    }


return t;
}


    }



