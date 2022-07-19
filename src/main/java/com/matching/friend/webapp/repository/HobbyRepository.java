package com.matching.friend.webapp.repository;

import com.matching.friend.webapp.pojo.entity.Hobby;
import com.matching.friend.webapp.pojo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby,Long> {

    Hobby findByPerson(Person person);
}
