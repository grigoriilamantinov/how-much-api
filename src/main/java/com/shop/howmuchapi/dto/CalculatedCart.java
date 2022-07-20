package com.shop.howmuchapi.dto;

import java.util.List;
import java.util.Objects;

public class CalculatedCart {
    private List<CalculatedItem> calculatedItems;
    private float totalAmount;

    public CalculatedCart(List<CalculatedItem> calculatedItems, float totalAmount) {
        this.calculatedItems = calculatedItems;
        this.totalAmount = totalAmount;
    }

    public CalculatedCart() {
    }


    public List<CalculatedItem> getCalculatedItems() {
        return calculatedItems;
    }

    public void setCalculatedItems(List<CalculatedItem> calculatedItems) {
        this.calculatedItems = calculatedItems;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatedCart that = (CalculatedCart) o;
        return Float.compare(that.totalAmount, totalAmount) == 0 && Objects.equals(calculatedItems, that.calculatedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calculatedItems, totalAmount);
    }

    @Override
    public String toString() {
        return "CalculatedCart: " +
            "calculatedItems=" + calculatedItems +
            ", totalAmount=" + totalAmount +
            '}';
    }
}
