package az.credit.credit.dao.entity;

import az.credit.credit.model.enums.CreditsStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="credits")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class CreditsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    @ToString.Exclude
    private CustomersEntity customer;

    @OneToMany(mappedBy = "credits", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<StatusHistoryEntity> statusHistories;

    @OneToMany(mappedBy = "credits",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<OffersEntity> offers;

}
