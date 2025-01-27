package az.credit.credit.service;

import az.credit.credit.model.request.CreateCustomerRequest;

public interface CustomerService {
    void saveCustomer(CreateCustomerRequest request);
}
