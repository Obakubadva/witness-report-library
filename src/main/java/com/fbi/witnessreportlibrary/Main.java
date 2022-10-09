package com.fbi.witnessreportlibrary;

import com.fbi.witnessreportlibrary.Services.FileService;
import com.fbi.witnessreportlibrary.Services.PhoneValidationService;
import com.maxmind.geoip2.exception.GeoIp2Exception;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, GeoIp2Exception {
        FileService file = new FileService();
//        file.writer("43.228.94.140", "fojikitrag ");
        PhoneValidationService validate = new PhoneValidationService();
        System.out.println(validate.phoneValidation("00381612882343"));

    }
}
