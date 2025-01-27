package az.credit.credit.dao.repository;

import az.credit.credit.dao.entity.CreditsEntity;
import az.credit.credit.model.enums.CreditsStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface CreditsRepository extends JpaRepository<CreditsEntity,Long>, JpaSpecificationExecutor<CreditsEntity> {

    List<CreditsEntity> findAllByStatus(CreditsStatus status);

}
