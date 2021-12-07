package com.example.orderPro.exchangeProo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Transaction")
public class Order {

    @Id
    @Column(name =  "order_id")
    private String orderId;
    @Column
    private String product;
    @Column
    private int quantity;
    @Column
    private double price;
    @Column
    private String side;



//    public Order() {
//    }

//    public Order(String product, int quantity, double price, String side) {
//        this.product = product;
//        this.quantity = quantity;
//        this.price = price;
//        this.side = side;
//    }

//    public String getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(String orderId) {
//        this.orderId = orderId;
//    }
//
//    public String getProduct() {
//        return product;
//    }
//
//    public void setProduct(String product) {
//        this.product = product;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getSide() {
//        return side;
//    }
//
//    public void setSide(String side) {
//        this.side = side;
//    }

    @Override
    public String toString() {
        return "Order{" +
                "Stock='" + product + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", action='" + side + '\'' +
                '}';
    }
}
