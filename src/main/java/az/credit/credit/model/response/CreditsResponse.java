package az.credit.credit.model.response;

import az.credit.credit.model.enums.CreditsStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreditsResponse {
    private Long id;
    private BigDecimal amount;
    private Integer term;
    private BigDecimal interest;
    private BigDecimal monthlyPayment;
    private BigDecimal requestedAmount;
    private CreditsStatus status;
    private LocalDateTime checkDate;
    private Long customerId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
