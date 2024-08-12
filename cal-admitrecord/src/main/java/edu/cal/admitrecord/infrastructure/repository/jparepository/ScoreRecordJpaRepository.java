package edu.cal.admitrecord.infrastructure.repository.jparepository;

import edu.cal.admitrecord.infrastructure.entity.ScoreRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRecordJpaRepository extends JpaRepository<ScoreRecordEntity, Integer> {

}
