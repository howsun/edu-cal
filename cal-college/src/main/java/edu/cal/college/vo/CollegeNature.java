package edu.cal.college.vo;

/**
 * 办学性质
 */
public enum CollegeNature {
    PUBLIC("公立"),
    PRIVATE("民办"),
    COOPERATE("中外合作办学"),
    ;

    private String description;
    CollegeNature(String description) {
        this.description = description;
    }
    public String getName() {
        return name();
    }
    public String getDescription() {
        return description;
    }
}
