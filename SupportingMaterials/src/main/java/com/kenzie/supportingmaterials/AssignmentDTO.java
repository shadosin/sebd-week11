package com.kenzie.supportingmaterials;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name", "gradeValue"})
public class AssignmentDTO {
    private String name;
    private int gradeValue;

    public AssignmentDTO() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeValue() {
        return this.gradeValue;
    }

    public void setGradeValue(int gradeValue) {
        this.gradeValue = gradeValue;
    }

    @Override
    public String toString() {
        return "AssignmentDTO{" +
                "Name='" + this.name + '\'' +
                ", gradeValue=" + this.gradeValue +
                '}';
    }
}

