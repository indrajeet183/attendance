package com.attendance;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import javax.persistence.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long Id;

    @ElementCollection(targetClass=Integer.class)
    private List<Integer> attendanceArr;

    private String branchName;


    public Attendance(List<Integer> attendanceArr, String branchName) {
        this.attendanceArr = attendanceArr;
        this.branchName = branchName;
    }

    public void setbranchName(String branchName) {
        this.branchName=branchName;
    }
    public String getbranchName(){
        return branchName;
    }

    public List<Integer> getAttendanceArr() {
        return attendanceArr;
    }
    public void setAttendanceArr(List<Integer> attendanceArr) {
        this.attendanceArr = attendanceArr;
    }

    public void setId(long Id){this.Id=Id;}
    public long getId(){return Id;}


    @Override
    public String toString() {
        return String.format("ID :"+Id+" BranchName :" +branchName+ "Attendance Array :"+attendanceArr   );
    }
    protected Attendance() {}

}
