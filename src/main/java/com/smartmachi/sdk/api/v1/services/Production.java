package com.smartmachi.sdk.api.v1.services;

import com.smartmachi.sdk.api.v1.entities.*;
import com.smartmachi.sdk.api.v1.services.interfaces.IApiMethods;

import java.util.ArrayList;

/**
 * Created by procek69 on 11/03/16.
 */
public class Production implements IApiMethods {
    public boolean login(String email, String password) {
        return false;
    }

    public Beacon getBeacon(String beaconID) throws NotFindBeaconException {
        return null;
    }

    public ArrayList<SmartDevice> getIoTDeviceList(Account user) {
        return null;
    }

    public ArrayList<Command> getCommandList(IoTDevice device) {
        return null;
    }
}
