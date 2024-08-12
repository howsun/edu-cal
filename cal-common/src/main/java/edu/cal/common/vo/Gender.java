package edu.cal.common.vo;

public enum Gender {
    FEMALE("女生"), //0
    MALE("男生");   //1

    private String description;
    Gender(String description) {
        this.description = description;
    }
    public String getName() {
        return name();
    }
    public String getDescription() {
        return description;
    }

}
