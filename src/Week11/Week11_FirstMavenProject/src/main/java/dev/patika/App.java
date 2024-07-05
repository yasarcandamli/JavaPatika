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
        /*transaction.begin();
        Customer customer = entityManager.find(Customer.class, 1);
        customer.setCustomerName("Update Name");
        entityManager.persist(customer);
        entityManager.remove(customer);
        transaction.commit();*/

        transaction.begin();
        /*Code code = new Code();
        code.setGroup("11123");
        code.setSerial("44456");
        entityManager.persist(code);

        Product product = new Product();
        product.setName("Iphone 15 Pro");
        product.setPrice(85000);
        product.setStock(100);
        product.setCode(code);
        entityManager.persist(product);

        System.out.println(product.toString());*/

        Code code = entityManager.find(Code.class, 1);
        System.out.println(code.getProduct().getName());
        transaction.commit();
    }
}