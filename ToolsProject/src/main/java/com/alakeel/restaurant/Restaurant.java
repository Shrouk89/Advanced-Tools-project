package com.alakeel.restaurant;
import javax.persistence.*;

import java.io.Serializable;
import java.util.*;
@Entity
@Table(name = "restaurants")
public class Restaurant implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String address;
    
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Meal> meals = new ArrayList<>();
    
    // Constructors, getters and setters
    
    public Restaurant() {}
    
    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
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
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public List<Meal> getMeals() {
        return meals;
    }
    
    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
    
    public void addMeal(Meal meal) {
        meals.add(meal);
        meal.setRestaurant(this);

    }
    
    public void removeMeal(Meal meal) {
        meals.remove(meal);
        meal.setRestaurant(null);
    }
}

