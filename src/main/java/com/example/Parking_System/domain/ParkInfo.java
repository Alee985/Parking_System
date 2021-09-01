package com.example.Parking_System.domain;

import com.google.gson.annotations.SerializedName;


public class ParkInfo {
    @SerializedName("name")
    private String V_Name;

    @SerializedName("email")
    private String email;

    @SerializedName("status")
    private String status;

    private String parkin;

    private String parkout;

    public String getParkout() {
        return parkout;
    }

    public void setParkout(String parkout) {
        this.parkout = parkout;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    public String getParkin() {
        return parkin;
    }

    public void setParkin(String parkin) {
        this.parkin = parkin;
    }

    @Override
    public String toString(){
        return  status + "/" + V_Name + "/" + email + "/" + parkin +"/" +parkout ;
    }
}
