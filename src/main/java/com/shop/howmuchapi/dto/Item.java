package com.shop.howmuchapi.dto;

import java.util.Objects;

public class Item {
    private int id;
    private int quantity;

    public Item(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && quantity == item.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity);
    }

    @Override
    public String toString() {
        return "Item:" +
            "id=" + id +
            ", quantity=" + quantity;
    }
}
