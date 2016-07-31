package com.attendance;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

import javax.persistence.*;
import javax.swing.text.DateFormatter;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@JsonAutoDetect
@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long Id;

    @ElementCollection(targetClass=Integer.class)
    private List<Integer> attendanceArr;
    private String branchName;


    private Date date;

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }

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
        return String.format("ID :"+Id+" BranchName :" +branchName+ "Attendance Array :"+attendanceArr );
    }
    protected Attendance() {}

}
