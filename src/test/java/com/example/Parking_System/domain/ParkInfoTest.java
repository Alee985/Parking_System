package com.example.Parking_System.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkInfoTest {
ParkInfo obj=new ParkInfo();

    @Test
    void setV_Name(){
    obj.setV_Name("QWXW-12-3");
}
    @Test
    void getV_Name(){
        obj.setV_Name("QWXW-12-3");
        assertEquals("QWXW-12-3",obj.getV_Name());
    }
    @Test
    void setEmail(){
        obj.setEmail("m.ali.ather@gmail.com");
    }
    @Test
    void getEmail(){
        obj.setEmail("m.ali.ather@gmail.com");
        assertEquals("m.ali.ather@gmail.com",obj.getEmail());
    }
    @Test
    void setParkin(){
        obj.setParkin("12:00");
    }
    @Test
    void getParkin(){
        obj.setParkin("12:00");
        assertEquals("12:00",obj.getParkin());
    }
    @Test
    void setStatus(){
        obj.setStatus("in");
    }
    @Test
    void getStatus(){
        obj.setStatus("in");
        assertEquals("in",obj.getStatus());
    }
    @Test
    void setParkout(){
        obj.setParkout("12:00");
    }
    @Test
    void getParkout(){
        obj.setParkout("12:00");
        assertEquals("12:00",obj.getParkout());
    }


}