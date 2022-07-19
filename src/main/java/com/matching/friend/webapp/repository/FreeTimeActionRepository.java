package com.matching.friend.webapp.repository;

import com.matching.friend.webapp.pojo.entity.FreeTimeAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTimeActionRepository extends JpaRepository<FreeTimeAction, Long> {
}
