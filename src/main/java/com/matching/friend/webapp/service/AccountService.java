package com.matching.friend.webapp.service;

import com.matching.friend.webapp.pojo.ProfilePOJO;
import com.matching.friend.webapp.pojo.entity.Person;

import java.util.Collection;

public interface AccountService {

    Collection<Person> getAllPersons();

    Person createAccount(Person person);

    Person login(String email, String password);

    boolean resetPass(String email);

    boolean deletePerson(Long personId);

    boolean checkAndUpdatePass(String email, String password, String newPass);

    ProfilePOJO getProfile(Long personId);

    boolean updateProfile(ProfilePOJO profilePOJO);

    Person getAccountById(Long personId);

    Person updateAccount(Person person);
}
