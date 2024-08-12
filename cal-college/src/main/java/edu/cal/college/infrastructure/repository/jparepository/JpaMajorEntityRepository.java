package edu.cal.college.infrastructure.repository.jparepository;

import edu.cal.college.infrastructure.entity.CollegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * College实体操作操作
 */
public interface JpaMajorEntityRepository extends JpaRepository<CollegeEntity, Integer> {


}
