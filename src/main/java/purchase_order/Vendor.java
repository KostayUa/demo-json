package purchase_order;

public class Vendor {
    private String companyName;
    private String department;
    private String address;
    private String cityStZip;
    private String phone;
    private String fax;

    public Vendor() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
}
