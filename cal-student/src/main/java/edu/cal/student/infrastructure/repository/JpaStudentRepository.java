package edu.cal.student.infrastructure.repository;

import edu.cal.student.domain.repository.StudentRepository;
import edu.cal.student.infrastructure.repository.jparepository.AccountJpaRepository;
import edu.cal.student.infrastructure.repository.jparepository.DistrictJpaRepository;
import edu.cal.student.infrastructure.repository.jparepository.StudentJpaRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class JpaStudentRepository implements StudentRepository {
    @Resource
    private StudentJpaRepository studentJpaRepository;
    @Resource
    private AccountJpaRepository accountJpaRepository;
    @Resource
    private DistrictJpaRepository districtJpaRepository;
}
