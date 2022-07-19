package com.matching.friend.webapp.service;

import com.matching.friend.webapp.pojo.entity.Location;

import java.util.List;

public interface LocationService {
    Location createLocation(String location);

    List<Location> getAllLocation();

    String getLocationNameById(Long locationId);
}
