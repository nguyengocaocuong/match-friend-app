package com.matching.friend.webapp.util;

import com.matching.friend.webapp.pojo.ProfilePOJO;
import com.matching.friend.webapp.pojo.entity.Hobby;
import com.matching.friend.webapp.pojo.entity.Person;


public class ConvertObjectToPOJO {
    public static ProfilePOJO convertToProfile(Person person, Hobby hobby) {
        return hobby != null ?
                ProfilePOJO.builder()
                        .age(person.getAge())
                        .avatar(person.getAvatar())
                        .createTime(person.getCreateTime())
                        .education(person.getEducation())
                        .email(person.getEmail())
                        .freeTimeAction(person.getFreeTimeAction())
                        .height(person.getHeight())
                        .hobbyId(hobby.getHobbyId())
                        .name(person.getName())
                        .location(person.getLocation())
                        .phoneNumber(person.getPhoneNumber())
                        .religion(person.getReligion())
                        .sex(person.getSex())
                        .image(person.getImage())
                        .isAdmin(person.getIsAdmin())
                        .personId(person.getPersonId())

                        .likeAgeFrom(hobby.getLikeAgeFrom())
                        .likeAgeTo(hobby.getLikeAgeTo())
                        .likeEducation(hobby.getLikeEducation())
                        .likeFreeTimeAction(hobby.getLikeFreeTimeAction())
                        .likeHeightFrom(hobby.getLikeHeightFrom())
                        .likeHeightTo(hobby.getLikeHeightTo())
                        .likeLocation(hobby.getLikeLocation())
                        .likeReligion(hobby.getLikeReligion())
                        .likeSex(hobby.getLikeSex())
                        .build()
                :
                ProfilePOJO.builder()
                        .personId(person.getPersonId())
                        .age(person.getAge())
                        .avatar(person.getAvatar())
                        .createTime(person.getCreateTime())
                        .education(person.getEducation())
                        .email(person.getEmail())
                        .freeTimeAction(person.getFreeTimeAction())
                        .height(person.getHeight())
                        .name(person.getName())
                        .location(person.getLocation())
                        .phoneNumber(person.getPhoneNumber())
                        .religion(person.getReligion())
                        .sex(person.getSex())
                        .image(person.getImage())
                        .isAdmin(person.getIsAdmin())
                        .build();
    }
    public static Person revertPerson(ProfilePOJO profilePOJO){
        return Person.builder()
                .age(profilePOJO.getAge())
                .avatar(profilePOJO.getAvatar())
                .createTime(profilePOJO.getCreateTime())
                .education(profilePOJO.getEducation())
                .email(profilePOJO.getEmail())
                .freeTimeAction(profilePOJO.getFreeTimeAction())
                .height(profilePOJO.getHeight())
                .name(profilePOJO.getName())
                .location(profilePOJO.getLocation())
                .phoneNumber(profilePOJO.getPhoneNumber())
                .religion(profilePOJO.getReligion())
                .sex(profilePOJO.getSex())
                .image(profilePOJO.getImage())
                .isAdmin(profilePOJO.getIsAdmin())
                .personId(profilePOJO.getPersonId())
                .build();
    }

    public static Hobby revertHobby(ProfilePOJO profilePOJO){
        return Hobby.builder()
                .hobbyId(profilePOJO.getHobbyId())
                .likeAgeFrom(profilePOJO.getLikeAgeFrom())
                .likeAgeTo(profilePOJO.getLikeAgeTo())
                .likeEducation(profilePOJO.getLikeEducation())
                .likeFreeTimeAction(profilePOJO.getLikeFreeTimeAction())
                .likeHeightFrom(profilePOJO.getLikeHeightFrom())
                .likeHeightTo(profilePOJO.getLikeHeightTo())
                .likeLocation(profilePOJO.getLikeLocation())
                .likeReligion(profilePOJO.getLikeReligion())
                .likeSex(profilePOJO.getLikeSex())
                .build();
    }

}
