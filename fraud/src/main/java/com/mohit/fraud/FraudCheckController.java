package com.mohit.fraud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@Slf4j
public class FraudCheckController {

    @Autowired
    private FraudCheckService fraudCheckService;

    @  GetMapping(path="{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerId) {
        boolean isFraudulentCustomer = this.fraudCheckService.isFraudulentCustomer(customerId);
         log.info("Fraud check request for customer {}!", customerId);
        return new FraudCheckResponse(isFraudulentCustomer);

    }
}
