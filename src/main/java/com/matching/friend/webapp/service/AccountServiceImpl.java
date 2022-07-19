package com.matching.friend.webapp.service;

import com.matching.friend.webapp.pojo.ProfilePOJO;
import com.matching.friend.webapp.pojo.entity.Hobby;
import com.matching.friend.webapp.pojo.entity.Person;
import com.matching.friend.webapp.repository.HobbyRepository;
import com.matching.friend.webapp.repository.PersonRepository;
import com.matching.friend.webapp.util.ConvertObjectToPOJO;
import com.matching.friend.webapp.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AccountServiceImpl implements AccountService{
    private final PersonRepository personRepository;
    private final HobbyRepository hobbyRepository;
    private final EmailSenderService javaEmailSenderService;
    @Autowired
    public AccountServiceImpl(PersonRepository personRepository, HobbyRepository hobbyRepository, EmailSenderService javaEmailSenderService) {
        this.personRepository = personRepository;
        this.hobbyRepository = hobbyRepository;
        this.javaEmailSenderService = javaEmailSenderService;
    }


    @Override
    public Collection<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person createAccount(Person person) {
        if (personRepository.findByEmail(person.getEmail()).orElse(null) != null)
            return null;
        else
            return personRepository.save(person);
    }

    public Person login(String email, String password) {
        Person person = personRepository.findByEmail(email).orElse(null);
        if (person == null || person.getEmail().compareTo(password) != 0) return null;
        return person;
    }
    public boolean resetPass(String email){
        if(personRepository.findByEmail(email) == null)
            return false;
        String otp  = Util.getOTP();
        StringBuilder body = new StringBuilder();
        body.append("<span>Sử dụng mã sau để thay đổi password của bạn: </span>");
        body.append("</h2 style='display:inline-block'>"+ otp + "</h2>");
        javaEmailSenderService.sendSimpleEmail(
                "cuong35228102000@gmail.com",
                body.toString(),
                "Mã OTP của bạn : ");
        Util.listOtp.put(email,otp);
        return true;
    }

    @Override
    public boolean deletePerson(Long personId) {
        if(personRepository.existsById(personId)){
            personRepository.deleteById(personId);
            return true;
        }
        return false;
    }

    public boolean checkAndUpdatePass(String email, String password, String newPass){
        if(Util.checkOtp(email,password)){
            System.out.println("Success");
            return true;
        }else return false;
    }
    public ProfilePOJO getProfile(Long personId){
        Person person = personRepository.findById(personId).orElse(null);
        Hobby hobby = hobbyRepository.findByPerson(person);
        if(person == null) return null;
        return ConvertObjectToPOJO.convertToProfile(person,hobby);
    }
    public boolean updateProfile(ProfilePOJO profilePOJO){
        Person person = ConvertObjectToPOJO.revertPerson(profilePOJO);
        Hobby hobby = ConvertObjectToPOJO.revertHobby(profilePOJO);

        Person tmp = hobbyRepository.findByPerson(person).getPerson();
        if(tmp == null || tmp.getPersonId() != person.getPersonId())
            return false;
        personRepository.save(person);
        hobbyRepository.save(hobby);
        return true;
    }

    @Override
    public Person getAccountById(Long personId) {
        return personRepository.findById(personId).orElse(null);
    }

    @Override
    public Person updateAccount(Person person) {
        return personRepository.save(person);
    }
}
