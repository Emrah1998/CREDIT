package az.credit.credit.service;

import az.credit.credit.dao.repository.CreditsRepository;
import az.credit.credit.model.response.CreditsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static az.credit.credit.model.enums.CreditsStatus.ACCEPTED;

@Service
@RequiredArgsConstructor
public class CreditsServiceHandle implements CreditsService {

    private final CreditsRepository creditsRepository;

    @Override
    public List<CreditsResponse> getCredits() {

        return creditsRepository.findAllByStatus(ACCEPTED).stream().map(
                credit->CreditsResponse.builder()
                        .id(credit.getId())
                        .amount(credit.getAmount())
                        .term(credit.getTerm())
                        .interest(credit.getInterest())
                        .monthlyPayment(credit.getMonthlyPayment())
                        .requestedAmount(credit.getRequestedAmount())
                        .status(credit.getStatus())
                        .checkDate(credit.getCheckDate())
                        .customerId(credit.getCustomerId())
                        .createdAt(credit.getCreatedAt())
                        .updatedAt(credit.getUpdatedAt())
                        .build()).toList();

    }
}
