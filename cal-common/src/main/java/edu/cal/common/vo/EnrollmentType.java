package edu.cal.common.vo;

/**
 * 招生类型：普通类，单招类，定向类
 */
public enum EnrollmentType {
    COMMON("普通类"),
    ;

    private String description;
    EnrollmentType(String description) {
        this.description = description;
    }
    public String getName() {
        return name();
    }
    public String getDescription() {
        return description;
    }
}
