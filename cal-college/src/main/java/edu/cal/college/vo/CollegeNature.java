package edu.cal.college.vo;

/**
 * 办学性质
 */
public enum CollegeNature {
    PUBLIC("公立"),
    PRIVATE("民办");

    private String name;
    CollegeNature(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
