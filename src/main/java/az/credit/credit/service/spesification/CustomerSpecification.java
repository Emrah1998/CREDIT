package az.credit.credit.service.spesification;

import az.credit.credit.dao.entity.CustomersEntity;
import az.credit.credit.model.criteria.CustomerCriteria;
import az.credit.credit.util.PredicateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
@Data
@AllArgsConstructor
public class CustomerSpecification implements Specification<CustomersEntity> {

private final CustomerCriteria customerCriteria;


    @Override
    public Predicate toPredicate(Root<CustomersEntity> root,
                                 CriteriaQuery<?> query,
                                 CriteriaBuilder criteriaBuilder) {

        var predicates = PredicateUtil.builder()
                .addNullSafety(customerCriteria.getPin(),
                        Inputpin->criteriaBuilder.like(root.get(CustomersEntity.Fields.pin),
                                SearchCarsByLike(Inputpin)))
                .addNullSafety(customerCriteria.getFullName(),
                        InputFullname->criteriaBuilder.like(root.get(CustomersEntity.Fields.fullName),
                                SearchCarsByLike(InputFullname)))
                .addNullSafety(customerCriteria.getPhoneNumber(),
                        InputPhoneNumber->criteriaBuilder.like(root.get(CustomersEntity.Fields.phoneNumber),
                                SearchCarsByLike(InputPhoneNumber)))
                .build();

        return criteriaBuilder.and(predicates);

    }

    private String SearchCarsByLike(String keyword) {
        return "%" + keyword + "%";
    }

}
