package dev.patika;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Session
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        // Create - Read - Update - Delete (CRUD)
        session.beginTransaction();
        try {
            Customer customer = new Customer();

            //Create
            /*customer.setName("Hibernate Test");
            customer.setGender(Customer.GENDER.FEMALE);
            customer.setMail("test@patika.dev");
            customer.setOnDate(LocalDate.now());

            session.persist(customer);*/

            //Read
            /*customer = session.get(Customer.class, 1);*/
            //Another way
            /*customer = session.byId(Customer.class).getReference(2);
            System.out.println(customer.toString());*/

            //Update
            /*customer.setName("Değişti");
            session.persist(customer);*/

            //Delete
            /*session.remove(customer);*/

            //HQL
            List<Customer> customers = session
                    .createSelectionQuery("FROM Customer", Customer.class)
                    .getResultList();
            System.out.println(customers.toString());

            Customer customer1 = session
                    .createSelectionQuery("FROM Customer WHERE id = 2", Customer.class)
                    .getSingleResultOrNull();
            System.out.println(customer1.toString());

            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}