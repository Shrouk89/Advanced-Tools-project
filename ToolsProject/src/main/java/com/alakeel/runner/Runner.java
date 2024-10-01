package com.alakeel.runner;
import javax.persistence.*;

import java.io.Serializable;
import com.alakeel.restaurant.Meal;

@Entity
@Table(name = "runner")
public class Runner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @OneToOne(cascade = CascadeType.ALL)
    private RunnerLocation location;
    
    @OneToOne(cascade = CascadeType.ALL)
    private RunnerAvailability availability;
    
    @OneToOne(cascade = CascadeType.ALL)
    private RunnerService service;
    
    // Constructors, getters, and setters
    
    public Runner() {}
    
    public Runner(String name, RunnerLocation location, RunnerAvailability availability, RunnerService service) {
        this.name = name;
        this.location = location;
        this.availability = availability;
        this.service = service;
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
    
    public RunnerLocation getLocation() {
        return location;
    }
    
    public void setLocation(RunnerLocation location) {
        this.location = location;
    }
    
    public RunnerAvailability getAvailability() {
        return availability;
    }
    
    public void setAvailability(RunnerAvailability availability) {
        this.availability = availability;
    }
    
    public RunnerService getService() {
        return service;
    }
    
    public void setService(RunnerService service) {
        this.service = service;
    }
}
