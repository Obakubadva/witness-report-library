package com.fbi.witnessreportlibrary.Services;

import com.fbi.witnessreportlibrary.Model.GeoIP;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.model.CountryResponse;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

public class GeoIPLocationService {

    private DatabaseReader dbReader;

     public GeoIPLocationService() throws IOException, GeoIp2Exception{
         File db = new File("C:\\Users\\Koce\\Downloads\\GeoLite2-City.mmdb");
         dbReader = new DatabaseReader.Builder(db).build();
     }

     public GeoIP getLocation(String ipA) throws IOException, GeoIp2Exception{
         InetAddress ipAddress = InetAddress.getByName(ipA);
         CityResponse responseCity = dbReader.city(ipAddress);


         String country = responseCity.getCountry().getName();
         String city = responseCity.getCity().getName();
         return new GeoIP(ipA, city,country);
     }

}
