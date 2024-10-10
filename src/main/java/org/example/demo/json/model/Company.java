package org.example.demo.json.model;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Company {
    private String name;
    private String address;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cityStZip;
    private String phone;
    private String fax;
    private String website;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityStZip() {
        return cityStZip;
    }

    public void setCityStZip(String cityStZip) {
        this.cityStZip = cityStZip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
