package com.attendance;

import java.util.List;


public interface AttendanceService {

    Attendance save(Attendance attendance);
    List<Attendance> findAll();

}
