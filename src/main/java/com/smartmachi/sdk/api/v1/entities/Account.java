package com.smartmachi.sdk.api.v1.entities;

import java.util.ArrayList;

/**
 * Created by lukaszlesniewski on 11/03/16.
 */
public class Account {

    private String email;

    private ArrayList<IoTDevice> deviceList;

    public String getEmail() {
        return email;
    }

    public ArrayList<IoTDevice> getDeviceList() {
        return deviceList;
    }

}
