package com.matching.friend.webapp.controller;

import com.matching.friend.webapp.pojo.entity.Location;
import com.matching.friend.webapp.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("locations")
public class LocationController {
    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping()
    public Location createLocation(@PathVariable("locationName") String location){
        return locationService.createLocation(location);
    }
    @GetMapping()
    public Collection<Location> getAllLocation() {
        return locationService.getAllLocation();
    }

    @GetMapping("/{id}")
    public String getLocationName(@PathVariable("id") Long id){
        return locationService.getLocationNameById(id);
    }
}
