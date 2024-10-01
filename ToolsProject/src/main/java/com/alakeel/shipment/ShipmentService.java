package com.alakeel.shipment;
import javax.persistence.*;
import javax.ejb.*;
import com.alakeel.runner.*;
import java.util.*;
@Stateless
public class ShipmentService {
    @PersistenceContext
    private EntityManager em;
    
    public void createShipment(Shipment shipment) {
        em.persist(shipment);
    }
    
    public void updateShipment(Shipment shipment) {
        em.merge(shipment);
    }
    
    public void deleteShipment(Shipment shipment) {
        em.remove(em.contains(shipment) ? shipment : em.merge(shipment));
    }
    
    public Shipment findShipmentById(Long id) {
        return em.find(Shipment.class, id);
    }
    
    public List<Shipment> findShipmentsByStatus(String status) {
        TypedQuery<Shipment> query = em.createQuery(
                "SELECT s FROM Shipment s WHERE s.status = :status", Shipment.class);
        query.setParameter("status", status);
        return query.getResultList();
    }
    
    public List<Shipment> findShipmentsByRunner(Runner runner) {
        TypedQuery<Shipment> query = em.createQuery(
                "SELECT s FROM Shipment s WHERE s.runner = :runner", Shipment.class);
        query.setParameter("runner", runner);
        return query.getResultList();
    }
    
    public double calculateCost(Shipment shipment) {
        // calculate the cost based on the distance, weight, and other factors
        // return the calculated cost
        return shipment.getCost();
    }
    
    // add any additional methods if needed
}