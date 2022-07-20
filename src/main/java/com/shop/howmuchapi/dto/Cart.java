package com.shop.howmuchapi.dto;

import java.util.List;
import java.util.Objects;

public class Cart {
    private List<Item> items;
    private String paymentType;
    private int addressId;

    public Cart(List<Item> items, String paymentType, int addressId) {
        this.items = items;
        this.paymentType = paymentType;
        this.addressId = addressId;
    }

    public Cart() {
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return addressId == cart.addressId && Objects.equals(items, cart.items) && Objects.equals(paymentType, cart.paymentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, paymentType, addressId);
    }

    @Override
    public String toString() {
        return "Cart: " +
            "items=" + items +
            ", paymentType='" + paymentType + '\'' +
            ", addressId=" + addressId;
    }
}
