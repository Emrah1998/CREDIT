package az.credit.credit.dao.repository;

import az.credit.credit.dao.entity.OffersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OffersRepository extends JpaRepository<OffersEntity,Long>, JpaSpecificationExecutor<OffersEntity> {
}
