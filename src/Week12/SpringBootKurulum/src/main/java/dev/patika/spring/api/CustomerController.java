package dev.patika.spring.api;

import dev.patika.spring.business.abstracts.ICustomerService;
import dev.patika.spring.dto.CustomerResponse;
import dev.patika.spring.dto.CustomerSaveRequest;
import dev.patika.spring.dto.CustomerUpdateRequest;
import dev.patika.spring.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1")
public class CustomerController {

    /*//Constructor
    private final ICustomerService customerService;
    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    //Setter
    private ICustomerService customerService;
    @Autowired
    public void setCustomerService(ICustomerService customerService) {
        this.customerService = customerService;
    }*/

    //Field
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerResponse> findAll() {
        /*List<CustomerDto> customerDtoList = this.customerService.findAll().stream().map(
                customer -> this.converter.convertDto(customer)
        ).collect(Collectors.toList());*/
        List<CustomerResponse> customerDtoList = this.customerService.findAll().stream().map(
                customer -> this.modelMapper.map(customer, CustomerResponse.class)
        ).collect(Collectors.toList());
        return customerDtoList;
    }

    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer save(@RequestBody CustomerSaveRequest customerSaveRequest) {
        Customer newCustomer = this.modelMapper.map(customerSaveRequest, Customer.class);
        newCustomer.setOnDate(LocalDate.now());
        return this.customerService.save(newCustomer);
    }

    @PutMapping("/customers")
    @ResponseStatus(HttpStatus.OK)
    public Customer update(@RequestBody CustomerUpdateRequest customerUpdateRequest) {
        Customer updatedCustomer = this.customerService.getById(customerUpdateRequest.getId());
        updatedCustomer.setName(customerUpdateRequest.getName());
        updatedCustomer.setGender(customerUpdateRequest.getGender());
        return this.customerService.update(updatedCustomer);
    }

    @DeleteMapping("/customers/{id}")
    public void delete(@PathVariable("id") int id) {
        this.customerService.delete(id);
    }

    @GetMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerResponse getById(@PathVariable("id") int id) {
        return this.modelMapper.map(this.customerService.getById(id), CustomerResponse.class);
    }
}
