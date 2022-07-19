package com.matching.friend.webapp.repository;

import com.matching.friend.webapp.pojo.AvgYear;
import com.matching.friend.webapp.pojo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByEmail(String email);
    @Query(
            value = "SELECT create_time, COUNT(p.person_id) FROM person p GROUP BY p.create_time",
            nativeQuery = true
    )
    List<Object[]> avgInYear();

}
