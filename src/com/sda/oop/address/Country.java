package com.sda.oop.address;

public class Country {

    private String countryCode;
    private String countryName;


    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(final String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country Name:" + this.getCountryName() + " Country Code:" + this.countryCode + " used by toString() method.";
    }

}
