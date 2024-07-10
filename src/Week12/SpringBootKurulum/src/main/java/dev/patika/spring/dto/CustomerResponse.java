package dev.patika.spring.dto;

import dev.patika.spring.entity.Customer;

// Pojo
// Customer -> CustomerDto
public class CustomerResponse {
    private int id;
    private String name;
    private String mail;
    public Customer.GENDER gender;

    public CustomerResponse(int id, String name, String mail, Customer.GENDER gender) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.gender = gender;
    }

    public CustomerResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Customer.GENDER getGender() {
        return gender;
    }

    public void setGender(Customer.GENDER gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CustomerResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", gender=" + gender +
                '}';
    }
}
