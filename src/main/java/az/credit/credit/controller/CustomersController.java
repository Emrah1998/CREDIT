package az.credit.credit.controller;

import az.credit.credit.model.request.CreateCustomerRequest;
import az.credit.credit.service.CustomerServiceHandle;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/customers")
public class CustomersController {

    private final CustomerServiceHandle customerService;

    @PostMapping
    public void saveCustomer(@RequestBody CreateCustomerRequest request){
        customerService.saveCustomer(request);
    }

}
