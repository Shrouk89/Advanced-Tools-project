package com.alakeel.customer;
import javax.persistence.*;

@Entity
@Table(name = "payment_method")
public class PaymentMethod {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    // Constructors, getters, and setters
    
    public PaymentMethod() {}
    
    public PaymentMethod(String name) {
        this.name = name;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}