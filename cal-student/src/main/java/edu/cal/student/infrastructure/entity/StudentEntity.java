package edu.cal.student.infrastructure.entity;

import edu.cal.common.vo.AcademicType;
import edu.cal.common.vo.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 考生信息
 * @author 牛亚平
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "acl_student")
public class StudentEntity implements Serializable {

    /**雪花ID*/
    @Id
    private Long id;

    /**考生姓名**/
    @Column(length = 32)
    private String name;

    /**电话**/
    @Column(length = 64)
    private String phone;

    /**性别**/
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    /**出生日期**/
    @Temporal(TemporalType.DATE)
    private Date birthday;

    /**中学所在省**/
    @Column(length = 16)
    private Integer provinceId;

    /**中学所在市**/
    @Column(length = 16)
    private Integer cityId;

    /**中学所在县**/
    @Column(length = 16)
    private Integer areaId;

    /**中学名称**/
    @Column(length = 64)
    private String school;

    /**考生兴趣**/
    @Column(length = 128)
    private String interests;

    /**考生成绩**/
    private Integer score;

    /**考生文理科方向**/
    @Column(name="academic_type")
    @Enumerated(EnumType.STRING)
    private AcademicType academicType;

    /**考生加分项**/
    private Integer pluses;

}
