package com.matching.friend.webapp.controller;

import com.matching.friend.webapp.pojo.AvgYear;
import com.matching.friend.webapp.pojo.entity.Person;
import com.matching.friend.webapp.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("features")
public class FeatureController {
    private final FeatureService featureService;

    @Autowired
    public FeatureController(FeatureService featureService) {
        this.featureService = featureService;
    }

    @GetMapping("/top-match/{id}")
    public List<Person> getTopMatchFriend(@PathVariable("id") Long personId){
        return featureService.getMatchFriend(personId);
    }

    @GetMapping("/avg")
    public List<Object[]> getAvgInYear(){
        return featureService.getAvg();
    }
}
