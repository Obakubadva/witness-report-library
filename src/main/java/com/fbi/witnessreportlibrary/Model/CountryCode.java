package com.fbi.witnessreportlibrary.Model;

public class CountryCode {
    private String countryCodeFromPhone;

    public CountryCode() {
    }

    public CountryCode(String countryCodeFromPhone) {
        this.countryCodeFromPhone = countryCodeFromPhone;
    }

    public String getCountryCodeFromPhone() {
        return countryCodeFromPhone;
    }

    public void setCountryCodeFromPhone(String countryCodeFromPhone) {
        this.countryCodeFromPhone = countryCodeFromPhone;
    }
}
