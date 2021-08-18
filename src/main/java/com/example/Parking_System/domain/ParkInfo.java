package com.example.Parking_System.domain;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class ParkInfo {
    @SerializedName("name")
    private String V_Name;
    @SerializedName("Email")
    private String email;
    Date parkin;

    public String getV_Name() {
        return V_Name;
    }

    public void setV_Name(String v_Name) {
        V_Name = v_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getParkin() {
        return parkin;
    }

    public void setParkin(Date parkin) {
        this.parkin = parkin;
    }

    @Override
    public String toString(){
        return "Vehicle Name is : " + V_Name +"\nUser Email is " + email;
    }
}
