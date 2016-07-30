package com.attendance;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AttendanceController{

    @Autowired
    AttendanceService attImpl;


    @RequestMapping(value="", method=RequestMethod.POST)
    public Attendance createAttendance(@RequestBody Attendance attendance) {
        System.out.println("APRAM:"+attendance);
        return attImpl.save(attendance);
    }
    
    // GET: http://localhost:8080/Attendances
    @RequestMapping(value="", method=RequestMethod.GET)
    public List<Attendance> getAttendances() {
        List<Attendance> attendances = new ArrayList<Attendance>();
        attendances = (List<Attendance>) attImpl.findAll();
        return attendances;
    }
}
