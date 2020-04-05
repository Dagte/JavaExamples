package com.sda.oop.address;

public class City {

    private Long cityId;
    private String cityName;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(final Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(final String cityName) {
        if (cityName != null && !cityName.isEmpty()) {
            this.cityName = cityName;
        } else {
            System.out.println("please enter valid city");
        }
    }

    @Override
    public String toString() {
        return "City Id:" + this.cityId + " city Name:" + this.cityName;
    }
}
