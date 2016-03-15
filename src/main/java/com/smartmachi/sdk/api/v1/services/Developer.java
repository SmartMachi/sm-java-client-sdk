package com.smartmachi.sdk.api.v1.services;

import com.smartmachi.sdk.api.v1.entities.*;
import com.smartmachi.sdk.api.v1.services.interfaces.IApiMethods;

import java.util.ArrayList;

/**
 * Created by procek69 on 11/03/16.
 */
public class Developer implements IApiMethods {

    private static ArrayList<Beacon> beacons = new ArrayList<Beacon>() {{
        add(new Beacon(
                "123456789a",
                "http://example.com/",
                "Example text",
                "The owner",
                "http://example.com/avatar.jpg"
        ));
        add(new Beacon(
                "123456789b",
                "http://example.com/",
                "Example text",
                "The owner",
                "http://example.com/avatar.jpg"
        ));
        add(new Beacon(
                "123456789c",
                "http://example.com/",
                "Example text",
                "The owner",
                "http://example.com/avatar.jpg"
        ));
        add(new Beacon(
                "123456789d",
                "http://example.com/",
                "Example text",
                "The owner",
                "http://example.com/avatar.jpg"
        ));
        add(new Beacon(
                "123456789e",
                "http://example.com/",
                "Example text",
                "The owner",
                "http://example.com/avatar.jpg"
        ));
    }};

    public boolean login(String email, String password) {
        return email.equals("user") && password.equals("password");
    }

    public Beacon getBeacon(String beaconID) throws NotFindBeaconException {
        for (Beacon beacon : beacons) {
            if (beacon.getId().equals(beaconID)) {
                return beacon;
            }
        }
        throw new NotFindBeaconException();
    }

    public ArrayList<SmartDevice> getIoTDeviceList(Account user) {
        return null;
    }

    public ArrayList<Command> getCommandList(IoTDevice device) {
        return null;
    }
}
