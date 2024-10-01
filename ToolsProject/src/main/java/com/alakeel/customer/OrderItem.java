package com.alakeel.customer;
import javax.persistence.*;

import java.io.Serializable;
import com.alakeel.restaurant.Meal;

@Entity
@Table(name = "order_items")
public class OrderItem implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal_id")
    private Meal meal;
    
    @Column(nullable = false)
    private int quantity;
    
    @Column(nullable = false)
    private double price;
    
    // Constructors, getters and setters
    
    public OrderItem() {}
    
    public OrderItem(Order order, Meal meal, int quantity, double price) {
        this.order = order;
        this.meal = meal;
        this.quantity = quantity;
        this.price = price;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Order getOrder() {
        return order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    
    public Meal getMeal() {
        return meal;
    }
    
    public void setMeal(Meal meal) {
        this.meal = meal;
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
}