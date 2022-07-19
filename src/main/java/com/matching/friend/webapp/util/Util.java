package com.matching.friend.webapp.util;

import com.matching.friend.webapp.pojo.entity.Hobby;
import com.matching.friend.webapp.pojo.entity.Person;

import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

public class Util {
    public static HashMap<String, String> listOtp = new HashMap<>();

    public static String getOTP() {
        UUID oop = new UUID(54L, 73L);
        return oop.randomUUID().toString().substring(6);
    }

    public static boolean checkOtp(String email, String otp) {
        return listOtp.get(email) != null && listOtp.get(email).compareTo(otp) == 0;
    }

    public static int getScoreMatch(Hobby hobby, Person p1) {
        int rand1 = 0;
        if (hobby.getLikeReligion() != null && p1.getReligion() != null && hobby.getLikeReligion().compareTo(p1.getReligion()) == 0)
            ++rand1;
        if (hobby.getLikeLocation() != null && p1.getLocation() != null && hobby.getLikeLocation().getLocationId().compareTo(p1.getLocation().getLocationId()) == 0)
            ++rand1;
        if (hobby.getLikeSex() != null && p1.getSex() != null && hobby.getLikeSex().compareTo(p1.getSex()) == 0)
            ++rand1;
        if (hobby.getLikeEducation() != null && p1.getEducation() != null && hobby.getLikeEducation().compareTo(p1.getEducation()) == 0)
            ++rand1;
        if (hobby.getLikeFreeTimeAction() != null && p1.getFreeTimeAction() != null && hobby.getLikeFreeTimeAction().getFreeTimeActionId().compareTo(p1.getFreeTimeAction().longValue()) == 0)
            ++rand1;
        if (hobby.getLikeAgeFrom() != null && hobby.getLikeAgeTo() != null && p1.getAge() != null && hobby.getLikeAgeFrom() <= p1.getAge() && hobby.getLikeAgeTo() >= p1.getAge())
            ++rand1;
        if (hobby.getLikeHeightFrom() != null && hobby.getLikeHeightTo() != null && p1.getHeight() != null && hobby.getLikeHeightFrom() <= p1.getHeight() && hobby.getLikeHeightTo() >= p1.getHeight())
            ++rand1;
        return rand1;
    }
}
