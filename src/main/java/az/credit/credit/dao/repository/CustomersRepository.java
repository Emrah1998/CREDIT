package az.credit.credit.dao.repository;

import az.credit.credit.dao.entity.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomersRepository extends JpaRepository<CustomersEntity,Long>, JpaSpecificationExecutor<CustomersEntity> {
}
