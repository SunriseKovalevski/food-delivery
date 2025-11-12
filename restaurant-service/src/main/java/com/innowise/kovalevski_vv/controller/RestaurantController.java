package com.innowise.kovalevski_vv.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @GetMapping
    public String getRestaurants() {
        return "Restaurants list from Restaurant Service";
    }

    @GetMapping("/{id}")
    public String getRestaurant(@PathVariable String id) {
        return "Restaurant with id: " + id;
    }
}
