package edu.cal.college;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Cal_Test")
public class CollegeApplicationTest {

    @Test
    public void test(){
        System.out.println(this);
    }
}
