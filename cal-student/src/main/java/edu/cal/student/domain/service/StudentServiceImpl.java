package edu.cal.student.domain.service;

import edu.cal.student.domain.repository.StudentRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentRepository studentRepository;

}
