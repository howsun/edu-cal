package edu.cal.student.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 地区实体
 * @author 牛亚平
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "acl_district")
public class DistrictEntity implements Serializable {

    /**ID，导入时写死**/
    @Id
    private Integer id;

    /**地区名称**/
    @Column(length = 16)
    private String name;

    /**地区代码**/
    @Column(length = 6)
    private String code;

    /**父ID，空表示1级**/
    private Integer parent;
}
