package com.devglan.customerservice.dto;

import com.devglan.commons.Customer;
import com.devglan.commons.Product;

import java.util.List;

public class CustomerDto extends Customer {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
