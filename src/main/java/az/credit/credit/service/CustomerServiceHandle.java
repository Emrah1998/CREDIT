package az.credit.credit.service;

import az.credit.credit.dao.entity.CustomersEntity;
import az.credit.credit.dao.repository.CustomersRepository;
import az.credit.credit.model.request.CreateCustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CustomerServiceHandle implements CustomerService {

    private final CustomersRepository customersRepository;

    @Override
    public void saveCustomer(CreateCustomerRequest request) {
        customersRepository.save(
                CustomersEntity.builder()
                        .pin(request.getPin())
                        .fullName(request.getFullName())
                        .phoneNumber(request.getPhoneNumber())
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .build()
        );
    }
}
