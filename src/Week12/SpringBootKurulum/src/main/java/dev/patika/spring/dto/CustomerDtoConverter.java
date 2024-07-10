package dev.patika.spring.dto;

import dev.patika.spring.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {
    public CustomerDto convertDto(Customer customer) {
        /*CustomerDto customerDto = new CustomerDto();

        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setMail(customer.getMail());

        return customerDto;*/
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getMail()
        );
    }
}
