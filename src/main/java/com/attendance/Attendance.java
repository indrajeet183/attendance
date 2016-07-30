package com.attendance;

import java.util.List;
import java.util.StringJoiner;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String branchName;

    public Attendance(String branchName){
        this.branchName=branchName;
    }
    public void setbranchName(String branchName) {
        this.branchName=branchName;
    }
    public String getbranchName(String branchName){
        return branchName;
    }
    @Override
    public String toString() {
        return String.format("ID :"+id+" BranchName :" +branchName);
    }
    protected Attendance() {}

}
