package dev.patika.spring.dto;

import dev.patika.spring.entity.Customer;

public class CustomerUpdateRequest {
    private int id;
    private String name;
    private Customer.GENDER gender;

    public CustomerUpdateRequest() {
    }

    public CustomerUpdateRequest(int id, String name, Customer.GENDER gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
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

    public Customer.GENDER getGender() {
        return gender;
    }

    public void setGender(Customer.GENDER gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CustomerUpdateRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
