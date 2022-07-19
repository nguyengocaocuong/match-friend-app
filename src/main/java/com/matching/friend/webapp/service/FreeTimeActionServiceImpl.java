package com.matching.friend.webapp.service;

import com.matching.friend.webapp.pojo.entity.FreeTimeAction;
import com.matching.friend.webapp.repository.FreeTimeActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FreeTimeActionServiceImpl implements FreeTimeActionService{
    private final FreeTimeActionRepository freeTimeActionRepository;

    @Autowired
    public FreeTimeActionServiceImpl(FreeTimeActionRepository freeTimeActionRepository) {
        this.freeTimeActionRepository = freeTimeActionRepository;
    }

    @Override
    public FreeTimeAction createFreeTimeAction(String freeTimeAction) {
        return freeTimeActionRepository.save(FreeTimeAction.builder().actionName(freeTimeAction).build());
    }

    @Override
    public Collection<FreeTimeAction> getAllFreeTimeAction() {
        return freeTimeActionRepository.findAll();
    }

    @Override
    public String getFreeTimeActionById(Long freeTimeActionId) {
        FreeTimeAction freeTimeAction = freeTimeActionRepository.findById(freeTimeActionId).orElse(null);
        return freeTimeAction != null ? freeTimeAction.getActionName() : null;
    }
}
