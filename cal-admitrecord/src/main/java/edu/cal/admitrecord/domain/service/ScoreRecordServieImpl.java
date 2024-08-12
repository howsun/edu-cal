package edu.cal.admitrecord.domain.service;

import edu.cal.admitrecord.domain.repository.ScoreRecordRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 */
@Service
@Transactional
public class ScoreRecordServieImpl implements ScoreRecordServie{
    @Resource
    private ScoreRecordRepository scoreRecordRepository;

}
