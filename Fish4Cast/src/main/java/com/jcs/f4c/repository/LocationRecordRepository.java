package com.jcs.f4c.repository;

import com.jcs.f4c.entities.LocationRecord;
import com.jcs.f4c.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Transactional
@Repository
public interface LocationRecordRepository extends JpaRepository<LocationRecord, Long> {

//    List<LocationRecord> findAllBy(User user);
//    Optional<LocationRecord> findByRecordId(Long id);
}
