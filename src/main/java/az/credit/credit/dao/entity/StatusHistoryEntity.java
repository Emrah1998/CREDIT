package az.credit.credit.dao.entity;

import az.credit.credit.model.enums.StatusHistoryStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name="status_history")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class StatusHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private StatusHistoryStatus status;
    private LocalDateTime createdAt;
    private Long creditId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_id")
    @ToString.Exclude

    private CreditsEntity credit;

}
