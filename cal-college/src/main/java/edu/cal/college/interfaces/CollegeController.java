package edu.cal.college.interfaces;

import edu.cal.college.domain.service.CollegeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

    @Resource
    private CollegeService collegeService;


}
