package com.matching.friend.webapp.service;

import com.matching.friend.webapp.pojo.AvgYear;
import com.matching.friend.webapp.pojo.entity.Person;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface FeatureService {
    List<Person> getMatchFriend(Long personId);

    List<Object[]> getAvg();
}
