package view;

import business.concretes.CustomerManager;
import dao.concretes.CustomerDao;
import entity.Customer;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new CustomerDao());

        /*Customer customer = new Customer();
        customer.setName("Test Dersleri");
        customer.setMail("test@patika.dev");
        customer.setGender(Customer.GENDER.FEMALE);
        customer.setOnDate(LocalDate.now());

        customerManager.save(customer);*/

        /*Customer firstCustomer = customerManager.findById(1);
        System.out.println(firstCustomer.toString());*/

        /*customerManager.deleteById(2);*/

        /*Customer customer = customerManager.findById(1);
        customer.setName("Update Test");
        customer.setMail("test@patika.dev");
        customerManager.update(customer);*/

        List<Customer> customerList = customerManager.findAll();
        System.out.println(customerList.toString());
    }
}