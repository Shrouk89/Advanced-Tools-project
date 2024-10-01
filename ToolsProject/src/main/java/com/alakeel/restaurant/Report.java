package com.alakeel.restaurant;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "report")
public class Report {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Date date;
    
    private double totalSales;
    
    // Constructors, getters, and setters
    
    public Report() {}
    
    public Report(Date date, double totalSales) {
       this.date = date;
        this.totalSales = totalSales;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public double getTotalSales() {
        return totalSales;
    }
    
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
}