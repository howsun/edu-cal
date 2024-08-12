package edu.cal.college.infrastructure.repository;

import edu.cal.college.domain.repository.CollegeRepository;
import edu.cal.college.infrastructure.repository.jparepository.JpaCollegeEntityRepository;
import edu.cal.college.infrastructure.repository.jparepository.JpaMajorEntityRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 */
@Repository
public class JpaCollegeRepository implements CollegeRepository {

    @Resource
    private JpaMajorEntityRepository jpaMajorEntityRepository;

    @Resource
    private JpaCollegeEntityRepository jpaCollegeEntityRepository;

}
