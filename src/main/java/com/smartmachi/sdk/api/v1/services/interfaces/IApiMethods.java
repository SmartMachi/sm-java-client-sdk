package com.smartmachi.sdk.api.v1.services.interfaces;

import com.smartmachi.sdk.api.v1.entities.*;
import com.smartmachi.sdk.api.v1.services.NotFindBeaconException;

import java.util.ArrayList;

public interface IApiMethods {

    boolean login(String email, String password);

    Beacon getBeacon(String beaconID) throws NotFindBeaconException;

    ArrayList<SmartDevice> getIoTDeviceList(Account user);

    ArrayList<Command> getCommandList(IoTDevice device);
}
