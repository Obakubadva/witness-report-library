package com.fbi.witnessreportlibrary;

import com.fbi.witnessreportlibrary.Services.FileService;
import com.fbi.witnessreportlibrary.Services.GeoIPLocationService;
import com.fbi.witnessreportlibrary.Services.PhoneValidationService;
import com.maxmind.geoip2.exception.GeoIp2Exception;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, GeoIp2Exception {
        FileService file = new FileService();
//        file.writer("43.228.94.140", "fojikitrag ");
        PhoneValidationService validate = new PhoneValidationService();
        System.out.println(validate.phoneValidation("00381612882343"));
        GeoIPLocationService service = new GeoIPLocationService();
 //       System.out.println(service.getLocation("184.213.237.137").getCity());
    }
}
