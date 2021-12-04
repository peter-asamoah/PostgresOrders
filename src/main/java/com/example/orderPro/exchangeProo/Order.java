package com.example.orderPro.exchangeProo;
import javax.persistence.*;

@Entity
@Table(name = "orderss")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String stock;
    @Column
    private int quantity;
    @Column
    private double price;
    @Column
    private String action;

    public Order(String stock, int quantity, double price, String action) {
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
        this.action = action;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID='" + id + '\'' +
                "Stock='" + stock + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", action='" + action + '\'' +
                '}';
    }
}
