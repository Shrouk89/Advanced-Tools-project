package com.alakeel.restaurant;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menu")
public class Menu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<MenuItem> items;
    
    // Constructors, getters, and setters
    
    public Menu() {}
    
    public Menu(List<MenuItem> items) {
        this.items = items;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public List<MenuItem> getItems() {
        return items;
    }
    
    public void setItems(List<MenuItem> items) {
        this.items = items;
    }
}