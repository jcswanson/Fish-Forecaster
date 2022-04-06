package com.jcs.f4c.service;

import com.jcs.f4c.entities.LocationRecord;
import com.jcs.f4c.entities.User;

public interface LocationRecordService {

    void saveLocationRecord(LocationRecord locationRecord, User user);
}
