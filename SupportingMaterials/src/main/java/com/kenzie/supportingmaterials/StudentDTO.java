package com.kenzie.supportingmaterials;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name", "currentlyEnrolledClassName", "totalGrade"})
public class StudentDTO {
    private String name;
    private String currentlyEnrolledClassName;
    private int totalGrade;

    public StudentDTO() {

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCurrentlyEnrolledClassName(){
        return this.currentlyEnrolledClassName;
    }

    public void setCurrentlyEnrolledClassName(String currentlyEnrolledClassName){
        this.currentlyEnrolledClassName = currentlyEnrolledClassName;
    }

    public int getTotalGrade(){
        return this.totalGrade;
    }

    public void setTotalGrade(int totalGrade){
        this.totalGrade = totalGrade;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "Name='" + this.name + '\'' +
                ", currentlyEnrolledClassName='" + this.currentlyEnrolledClassName + '\'' +
                ", totalGrade=" + this.totalGrade +
                '}';
    }
}
