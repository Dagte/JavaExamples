package com.sda.oop.address;

public class Address {

    private String streetName;
    private City city;
    private Country country;
    private String postalCode;


    public City getCity() {
        return city;
    }

    public void setCity(final City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }


    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(final String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Street Name:" + this.streetName + " Postal Code:" + this.postalCode + " Country:" + country.toString() + " City:" + city.toString();
    }
}
