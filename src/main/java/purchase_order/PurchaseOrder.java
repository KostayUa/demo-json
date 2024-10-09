package purchase_order;

import java.util.List;

public class PurchaseOrder {
    private Company company;
    private String date;
    private int number;
    private Vendor vendor;
    private ShipTo shipTo;
    private String currency;
    private List<ProductLine> productLines;
    private double subtotal;
    private Double tax;
    private Double shipping;
    private Double other;
    private double total;

    public PurchaseOrder() {
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public ShipTo getShipTo() {
        return shipTo;
    }

    public void setShipTo(ShipTo shipTo) {
        this.shipTo = shipTo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<ProductLine> getProductLines() {
        return productLines;
    }

    public void setProductLines(List<ProductLine> productLines) {
        this.productLines = productLines;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getShipping() {
        return shipping;
    }

    public void setShipping(Double shipping) {
        this.shipping = shipping;
    }

    public Double getOther() {
        return other;
    }

    public void setOther(Double other) {
        this.other = other;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
