package dev.patika.spring.business.concretes;

import dev.patika.spring.entity.Customer;
import dev.patika.spring.business.abstracts.ICustomerService;
import dev.patika.spring.dao.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements ICustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer getById(int id) {
        return this.customerRepo.findById(id).orElseThrow();
    }

    @Override
    public Customer save(Customer customer) {
        return this.customerRepo.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        if (customer.getId() == 0) {
            throw new RuntimeException("lütfen id değeri olan bir entity giriniz");
        }
        return this.customerRepo.save(customer);
    }

    @Override
    public void delete(int id) {
        Customer customer = this.getById(id);
        this.customerRepo.delete(customer);
    }

    @Override
    public List<Customer> findAll() {
        return this.customerRepo.findAll();
    }
}
