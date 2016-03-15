package com.smartmachi.sdk;


import com.smartmachi.sdk.api.v1.services.Developer;
import com.smartmachi.sdk.api.v1.services.Production;
import com.smartmachi.sdk.api.v1.services.interfaces.IApiMethods;

public class SmartMachi {

    private static IApiMethods service;
    private static boolean production;

    public static void setProductionReady(boolean production) {
        SmartMachi.production = production;
    }

    public static  IApiMethods getService() {
        if (service == null) {
            service = production ? new Production() : new Developer();
        }
        return service;
    }

}