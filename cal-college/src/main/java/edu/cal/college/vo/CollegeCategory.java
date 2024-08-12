package edu.cal.college.vo;

/**
 * 大学类别：
 * 综合类
 * 理工类
 * 农林类
 */
public enum CollegeCategory {
    COMPREHENSIVE("综合类"),
    SCIENCE("理工类"),
    AGRICULTURE("农林类"),
    OTHER("其它");
    ;
    private String description;
    CollegeCategory(String description) {
        this.description = description;
    }
    public String getName() {
        return name();
    }
    public String getDescription() {
        return description;
    }
}
