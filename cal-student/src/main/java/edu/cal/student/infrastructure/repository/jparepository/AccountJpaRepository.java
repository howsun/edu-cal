package edu.cal.student.infrastructure.repository.jparepository;

import edu.cal.student.infrastructure.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountJpaRepository extends JpaRepository<AccountEntity, Long> {

}
