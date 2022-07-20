package com.shop.howmuchapi.dto;

import com.shop.howmuchapi.requests.Request;
import com.shop.howmuchapi.requests.RequestToShopDatabase;
import com.shop.howmuchapi.services.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

public class CalculatedItem extends Item {
    private float thisItemSum;

    public CalculatedItem() {
    }

    public static CalculatedItem of(Item item) {
        CalculatedItem calculatedItem = new CalculatedItem();
        RequestToShopDatabase request = new RequestToShopDatabase();

        calculatedItem.setId(item.getId());
        calculatedItem.setQuantity(item.getQuantity());
        calculatedItem.setThisItemSum(request.getCost(item.getId()) * item.getQuantity());
        return calculatedItem;
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
