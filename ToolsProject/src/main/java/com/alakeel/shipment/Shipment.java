package com.alakeel.shipment;
import java.time.LocalDateTime;
import com.alakeel.runner.*;

import javax.persistence.*;
@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "origin_address_id", nullable = false)
    private Address origin;
    
    @ManyToOne
    @JoinColumn(name = "destination_address_id", nullable = false)
    private Address destination;
    
    @ManyToOne
    @JoinColumn(name = "runner_id", nullable = false)
    private Runner runner;
    
    @Column(nullable = false)
    private String status; // pending, in transit, delivered
    
    @Column(nullable = false)
    private LocalDateTime pickupTime;
    
    @Column(nullable = false)
    private LocalDateTime deliveryTime;
    
    @Column(nullable = false)
    private double cost;
    
    // constructors
    public Shipment() {
    }
    
    public Shipment(Address origin, Address destination, Runner runner, String status, LocalDateTime pickupTime, LocalDateTime deliveryTime, double cost) {
        this.origin = origin;
        this.destination = destination;
        this.runner = runner;
        this.status = status;
        this.pickupTime = pickupTime;
        this.deliveryTime = deliveryTime;
        this.cost = cost;
    }
    
    // getters and setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
       this.id = id;
    }
    
    public Address getOrigin() {
        return origin;
    }
    
    public void setOrigin(Address origin) {
        this.origin = origin;
    }
    
    public Address getDestination() {
        return destination;
    }
    
    public void setDestination(Address destination) {
        this.destination = destination;
    }
    
    public Runner getRunner() {
        return runner;
    }
    
    public void setRunner(Runner runner) {
        this.runner = runner;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public LocalDateTime getPickupTime() {
        return pickupTime;
    }
    
    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }
    
    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }
    
    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    
    public double getCost() {
        return cost;
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Shipment{" +
                "id=" + id +
                ", origin=" + origin +
                ", destination=" + destination +
                ", runner=" + runner +
                ",status='" + status + '\'' +
                ", pickupTime=" + pickupTime +
                ", deliveryTime=" + deliveryTime +
                ", cost=" + cost +
                '}';
    }
}