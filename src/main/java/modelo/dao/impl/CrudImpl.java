/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelo.dao.crud;
import modelo.entity.Product;

/**
 *
 * @author Francisco
 */
public class CrudImpl implements crud {

    private EntityManagerFactory emf;

    public CrudImpl() {
        emf = Persistence.createEntityManagerFactory("myPU");
    }

    
    
    @Override
    public void crear() {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Product product = new Product();
            product.setName("otro");
            product.setPrice(12);
            em.persist(product);
            em.getTransaction().commit();
        } catch (Exception e) {
        }
    }
}
