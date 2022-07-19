package com.matching.friend.webapp.service;

import com.matching.friend.webapp.pojo.entity.FreeTimeAction;

import java.util.Collection;

public interface FreeTimeActionService {
    FreeTimeAction createFreeTimeAction(String freeTimeAction);

    Collection<FreeTimeAction> getAllFreeTimeAction();

    String getFreeTimeActionById(Long freeTimeActionId);
}
