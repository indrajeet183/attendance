package com.attendance;

import java.util.List;

import javax.validation.OverridesAttribute;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;


@Service
@Validated
@Component
public class AttendanceImpl implements AttendanceService {
    
    @Autowired
    private AttendanceRepo attRepo;

    @Override
    @Transactional
    public Attendance save(Attendance attendance) {
        return attRepo.save(attendance);
    }

    @Override
    @Transactional(readOnly = true)
    public  List<Attendance> findAll() {
        return (List<Attendance>) attRepo.findAll();
    }

}

