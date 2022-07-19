package com.matching.friend.webapp.controller;

import com.matching.friend.webapp.pojo.entity.FreeTimeAction;
import com.matching.friend.webapp.service.FreeTimeActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/free-time-actions")
public class FreeTimeActionController {
    private final FreeTimeActionService freeTimeActionService;

    @Autowired
    public FreeTimeActionController(FreeTimeActionService freeTimeActionService) {
        this.freeTimeActionService = freeTimeActionService;
    }


    @GetMapping()
    public Collection<FreeTimeAction> getAllFreeTimeAction(){
        return freeTimeActionService.getAllFreeTimeAction();
    }

    @PostMapping()
    public FreeTimeAction createFreeTimeAction(@RequestBody String freeTimeActionName){
        return freeTimeActionService.createFreeTimeAction(freeTimeActionName);
    }
    @GetMapping("/{id}")
    public String getFreeTimeActionName(@PathVariable("id") Long id){
        return freeTimeActionService.getFreeTimeActionById(id);
    }
}
