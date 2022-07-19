package com.matching.friend.webapp.service;

import com.matching.friend.webapp.pojo.entity.Location;
import com.matching.friend.webapp.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{
    private final LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Location createLocation(String location) {
        return locationRepository.save(Location.builder().locationName(location).build());
    }

    @Override
    public List<Location> getAllLocation() {
        return locationRepository.findAll();
    }

    @Override
    public String getLocationNameById(Long locationId) {
        Location location = locationRepository.findById(locationId).orElse(null);
        return location != null ? location.getLocationName() : null;
    }
}
