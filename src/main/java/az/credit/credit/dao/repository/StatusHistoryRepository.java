package az.credit.credit.dao.repository;

import az.credit.credit.dao.entity.StatusHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StatusHistoryRepository extends JpaRepository<StatusHistoryEntity,Long>, JpaSpecificationExecutor<StatusHistoryEntity> {
}
