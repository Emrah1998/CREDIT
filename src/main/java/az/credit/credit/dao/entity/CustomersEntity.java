package az.credit.credit.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@FieldNameConstants
public class CustomersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pin;
    private String fullName;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "customers", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude

    private List<CreditsEntity> credits;

}
