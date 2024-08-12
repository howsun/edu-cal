package edu.cal.student.infrastructure.repository.jparepository;

import edu.cal.student.infrastructure.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<StudentEntity, Long> {
}
