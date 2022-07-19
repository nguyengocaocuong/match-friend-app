package com.matching.friend.webapp.controller;

import com.matching.friend.webapp.pojo.ProfilePOJO;
import com.matching.friend.webapp.pojo.OTP;
import com.matching.friend.webapp.pojo.entity.Person;
import com.matching.friend.webapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("")
    public Collection<Person> getAllPersons(){
        return accountService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getAccountById(@PathVariable("id") Long personId){
        Person person = accountService.getAccountById(personId);
        if( person != null) person.setPassword(null);
        return person;
    }

    @GetMapping("/{id}/profile")
    public ProfilePOJO getProfileById(@PathVariable("id") Long personId){
        return accountService.getProfile(personId);
    }

    @PutMapping("/update-profile")
    public boolean updateProfile(@RequestBody ProfilePOJO profilePOJO){
        return accountService.updateProfile(profilePOJO);
    }

    @PutMapping("/update-account")
    public Person updateAccount(@RequestBody Person person){
        return accountService.updateAccount(person);
    }

    @PostMapping("/create")
    public Person createAccount(@RequestBody Person person){
        return accountService.createAccount(person);
    }

    @GetMapping("/reset-pass")
    public boolean resetPassByEmail(@RequestParam("email") String email){
        return accountService.resetPass(email);
    }

    @PostMapping("/login")
    public Person login(@RequestBody Person person){
        return accountService.login(person.getEmail(),person.getPassword());
    }
    @PostMapping("/check-update-pass")
    public boolean checkAndUpdatePass(@RequestBody OTP otp){
        return accountService.checkAndUpdatePass(otp.getEmail(),otp.getOtp(), otp.getNewPass());
    }
}
