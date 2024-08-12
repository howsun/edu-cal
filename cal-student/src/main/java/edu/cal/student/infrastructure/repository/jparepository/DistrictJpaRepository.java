package edu.cal.student.infrastructure.repository.jparepository;

import edu.cal.student.infrastructure.entity.DistrictEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictJpaRepository extends JpaRepository<DistrictEntity, Integer> {

}
