package com.example.Parking_System.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQSTest {
    @Test
    void SendMessage(){
        String abc=SQS.SendMessage(null);
        assertEquals("Data Saved",abc);
    }

}