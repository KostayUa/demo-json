package org.example.demo.json.model;

public class ShipTo {
    private String companyName;
    private String recipient;
    private String address;
    private String cityStZip;
    private String phone;

    public ShipTo() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
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
}