package edu.cal.admitrecord.infrastructure.repository;

import edu.cal.admitrecord.domain.repository.ScoreRecordRepository;
import edu.cal.admitrecord.infrastructure.repository.jparepository.ScoreRecordJpaRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreRecordRepositoryImpl implements ScoreRecordRepository {

    @Resource
    private ScoreRecordJpaRepository scoreRecordJpaRepository;

}
