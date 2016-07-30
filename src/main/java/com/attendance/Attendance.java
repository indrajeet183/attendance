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

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long Id;

    private String branchName;

    public Attendance(String branchName){
        this.branchName=branchName;
    }
    public void setbranchName(String branchName) {
        this.branchName=branchName;
    }
    public void setId(long Id){this.Id=Id;}
    public String getbranchName(String branchName){
        return branchName;
    }
    @Override
    public String toString() {
        return String.format("ID :"+Id+" BranchName :" +branchName);
    }
    protected Attendance() {}

}
