package edu.cal.college.infrastructure.entity;

import edu.cal.college.vo.CollegeCategory;
import edu.cal.college.vo.CollegeNature;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "acl_college")
public class CollegeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    /**大学名称**/
    @Column(length = 32)
    private String name;

    /**曾用名**/
    @Column(length = 64)
    private String formerName;

    /**省**/
    @Column(length = 16)
    private String province;

    /**市**/
    @Column(length = 16)
    private String city;

    /**是否985**/
    private Boolean is985;

    /**是否211**/
    private Boolean is211;

    /**是否双一流**/
    @Column(name="is_double_first_class")
    private Boolean isDoubleFirstClass;

    /**办学性质**/
    @Enumerated()
    private CollegeCategory category;

    /**大学类别**/
    @Enumerated()
    private CollegeNature nature;

    /**归属**/
    @Column(length = 16)
    private String affiliation;
}
