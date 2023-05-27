package com.mohit.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path="api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
     public void registerCustomer(@RequestBody CustomerRegistrationRequest  customerRegistrationRequest) {
         log.info("New customer registration {}!", customerRegistrationRequest);
         customerService.registerCustomer(customerRegistrationRequest);
     }

}
