package dev.patika;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
        /*//Category ekleme
        Category category = new Category();
        category.setName("Telefonlar");
        entityManager.persist(category);

        //Supplier ekleme
        Supplier supplier = new Supplier();
        supplier.setAddress("Adres");
        supplier.setCompany("Patika");
        supplier.setContact("0500 000 00 00");
        supplier.setMail("info@patika.dev");
        supplier.setPerson("Yaşar Can");
        entityManager.persist(supplier);

        //Code ekleme
        Code code = new Code();
        code.setGroup("11123");
        code.setSerial("44456");
        entityManager.persist(code);

        //Product ekleme
        Product product = new Product();
        product.setName("Iphone 15 Pro");
        product.setPrice(85000);
        product.setStock(100);
        product.setCode(code);
        product.setSupplier(supplier);
        product.setCategory(category);
        entityManager.persist(product);

        System.out.println(product.toString());*/

        /*Color blue = new Color("Blue");
        Color red = new Color("Red");
        Color yellow = new Color("Yellow");
        entityManager.persist(blue);
        entityManager.persist(red);
        entityManager.persist(yellow);

        Product product = entityManager.find(Product.class, 1);
        List<Color> colorList = new ArrayList<>();
        colorList.add(blue);
        colorList.add(red);
        product.setColorList(colorList);

        entityManager.persist(product);*/



        Color color = entityManager.find(Color.class, 1);
        System.out.println(color.getProductList().toString());
        transaction.commit();
    }
}