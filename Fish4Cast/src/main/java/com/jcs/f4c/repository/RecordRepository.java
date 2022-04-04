package com.jcs.f4c.repository;

import com.jcs.f4c.entities.Record;
import com.jcs.f4c.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RecordRepository extends JpaRepository<Record, Integer> {

//    Optional<Record> findRecordBy(User user);
}
