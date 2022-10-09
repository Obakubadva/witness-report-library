package com.fbi.witnessreportlibrary.Services;

import com.fbi.witnessreportlibrary.Model.CountryCode;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class FileService {

    public void writer(String ipAddress, String context) throws IOException, GeoIp2Exception {
     GeoIPLocationService locationService = new GeoIPLocationService();
     BufferedWriter writer;

    {
        try {
            writer = new BufferedWriter(new FileWriter("report.txt"));
            String address ="Country: " + locationService.getLocation(ipAddress).getCountry();
            String city = "City: " + locationService.getLocation(ipAddress).getCity();
            String report = "Report: " + context;
            writer.write(address  + "\n" + city  + "\n" + report);
            writer.close();
        } catch (IOException | GeoIp2Exception e) {
            e.printStackTrace();
        }
    }

    }
}
