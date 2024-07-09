package dev.patika.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final ICustomerRepo customerRepo;

    public CustomerController(ICustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") int id) {
        return this.customerRepo.findById(id).orElseThrow();
    }

    @GetMapping("/find-all")
    public List<Customer> findAll() {
        return this.customerRepo.findAll();
    }

    @GetMapping("/mail/{mail}")
    public Customer findByMail(@PathVariable("mail") String mail) {
        return this.customerRepo.findByMail(mail);
    }

    @GetMapping("/mail/{mail}/{gender}")
    public Customer findByMailAndGender(@PathVariable("mail") String mail, @PathVariable("gender")Customer.GENDER gender) {
        return this.customerRepo.findByMailAndGender(mail, gender);
    }

    @GetMapping("/find/{gender}")
    public List<Customer> findByGender(@PathVariable("gender")Customer.GENDER gender) {
        return this.customerRepo.findByGender(gender);
    }

    @GetMapping("/get/{gender}")
    public List<Customer> getQueryByGender(@PathVariable("gender")Customer.GENDER gender) {
        return this.customerRepo.getQueryByGender(gender);
    }
}
