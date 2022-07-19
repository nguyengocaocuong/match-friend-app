package com.matching.friend.webapp.service;

import com.matching.friend.webapp.pojo.AvgYear;
import com.matching.friend.webapp.pojo.entity.Hobby;
import com.matching.friend.webapp.pojo.entity.Person;
import com.matching.friend.webapp.repository.HobbyRepository;
import com.matching.friend.webapp.repository.PersonRepository;
import com.matching.friend.webapp.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FeatureServiceImpl implements  FeatureService{
    private final PersonRepository personRepository;
    private final HobbyRepository hobbyRepository;

    @Autowired
    public FeatureServiceImpl(PersonRepository personRepository, HobbyRepository hobbyRepository) {
        this.personRepository = personRepository;
        this.hobbyRepository = hobbyRepository;
    }

    public List<Person> getMatchFriend(Long personId) {
        List<Person> matchPerson = personRepository.findAll();
        Hobby hobby = hobbyRepository.findByPerson(personRepository.findById(personId).orElse(null));
        matchPerson.stream().sorted((p1, p2) -> {
            int rand1 = Util.getScoreMatch(hobby,p1);
            int rand2 = Util.getScoreMatch(hobby,p2);

            return rand1 - rand2;
        });
        return matchPerson.size() > 4 ? matchPerson.subList(0,4) : matchPerson;
    }

    public List<Object[]> getAvg(){
        return personRepository.avgInYear();
    }
}
