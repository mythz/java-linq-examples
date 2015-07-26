package servicestack.net.javalinqexamples.support;

import java.util.ArrayList;

/**
 * Created by mythz on 7/26/2015.
 */
public class Customer {
    public String customerId;
    public String companyName;
    public String address;
    public String city;
    public String region;
    public String postalCode;
    public String country;
    public String phone;
    public String fax;
    public ArrayList<Order> orders;

    public Customer(String customerId, String companyName, String address, String city, String region, String postalCode, String country, String phone, String fax, ArrayList<Order> orders) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", orders='" + orders.size() + '\'' +
                '}';
    }
}
