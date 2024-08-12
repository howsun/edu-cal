package edu.cal.college.domain.service;

import edu.cal.college.domain.repository.CollegeRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CollegeServiceImpl implements CollegeService{

    @Resource
    private CollegeRepository collegeRepository;

}
