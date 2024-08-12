package edu.cal.common.vo;

/**
 * 科类
 */
public enum AcademicType {
    SCIENCE("理科"),
    ARTS("文科"),
    OTHER("其它");

    private String description;
    AcademicType(String description) {
        this.description = description;
    }
    public String getName() {
        return name();
    }
    public String getDescription() {
        return description;
    }
}
