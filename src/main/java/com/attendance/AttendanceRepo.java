package com.attendance;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface AttendanceRepo extends CrudRepository<Attendance,Long> {

    // No need to put query annotation if method name follows naming rule.
    // For details, check Spring Data JPA documentation
    List<Attendance> findBybranchName(String branchName);

}
