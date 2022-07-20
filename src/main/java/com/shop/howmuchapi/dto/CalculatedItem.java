package com.shop.howmuchapi.dto;

import java.util.Objects;

public class CalculatedItem extends Item {
    private float thisItemSum;

    public CalculatedItem(int id, int quantity) {
        super(id, quantity);
    }

    public CalculatedItem() {
    }

    public float getThisItemSum() {
        return thisItemSum;
    }

    public void setThisItemSum(float thisItemSum) {
        this.thisItemSum = thisItemSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CalculatedItem that = (CalculatedItem) o;
        return Float.compare(that.thisItemSum, thisItemSum) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), thisItemSum);
    }

    @Override
    public String toString() {
        return "CalculatedItem: " +
            "thisItemSum=" + thisItemSum +
            '}';
    }
}
