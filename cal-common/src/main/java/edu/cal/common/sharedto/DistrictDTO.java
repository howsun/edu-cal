package edu.cal.common.sharedto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 地区DTO
 */
@Data
public class DistrictDTO implements Serializable {

    /**ID，导入时写死**/
    private Integer id;

    /**地区名称**/
    private String name;

    /**地区代码**/
    private String code;

    /**父ID，空表示1级**/
    private DistrictDTO parent;

    private List<DistrictDTO> child;
}
