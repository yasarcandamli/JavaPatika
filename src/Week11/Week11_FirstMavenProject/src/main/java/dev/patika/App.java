package dev.patika;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        //CRUD
        transaction.begin();
        Customer customer = entityManager.find(Customer.class, 1);
        /*customer.setCustomerName("Update Name");
        entityManager.persist(customer);*/
        entityManager.remove(customer);
        transaction.commit();
    }
}