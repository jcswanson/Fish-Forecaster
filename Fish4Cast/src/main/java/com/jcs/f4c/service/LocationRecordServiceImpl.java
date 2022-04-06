package com.jcs.f4c.service;

import com.jcs.f4c.entities.LocationRecord;
import com.jcs.f4c.entities.User;
import com.jcs.f4c.repository.LocationRecordRepository;
import com.jcs.f4c.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationRecordServiceImpl implements LocationRecordService {

    @Autowired
    private LocationRecordRepository locationRecordRepository;
    @Autowired
    private UserRepository userRepository;


    @Override
    public void saveLocationRecord(LocationRecord locationRecord, User user) {
        user.addRecord(locationRecord);
        locationRecord.setUser(user);
        this.locationRecordRepository.save(locationRecord);
    }
}
