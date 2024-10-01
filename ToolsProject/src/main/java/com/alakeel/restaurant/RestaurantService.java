package com.alakeel.restaurant;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import javax.ejb.*;

@EJB
@Stateless
public class RestaurantService {
    
    @PersistenceContext(unitName = "restaurant")
    private EntityManager em;
    
    public void createMenu(Menu menu) {
        em.persist(menu);
    }
    
    public List<Menu> getAllMenus() {
        return em.createQuery("SELECT m FROM Menu m", Menu.class)
                .getResultList();
    }
    
    public void createReport(Report report) {
        em.persist(report);
    }
    
    public List<Report> getAllReports() {
        return em.createQuery("SELECT r FROM Report r", Report.class)
                .getResultList();
    }
}