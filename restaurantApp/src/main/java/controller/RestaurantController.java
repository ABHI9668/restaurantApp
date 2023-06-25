package controller;

import model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.RestaurantService;

import java.util.List;

@Controller
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    public RestaurantController() {

    }

    @GetMapping("restaurants")
    public List<Restaurant> getAllrestaurant() {


        return restaurantService.getAllRestaurants();
    }

    @GetMapping("restaurants/{restaurantId}")
    public Restaurant getRestaurantById(@PathVariable Integer restaurantId) {
        return restaurantService.getRestaurantById(restaurantId);
    }

    @PostMapping("restaurant")
    public String addrestaurant(@RequestBody Restaurant restaurant) {

        return restaurantService.addrestaurant(restaurant);
    }

//    @DeleteMapping("restaurant")
//    public String removerestaurant(@RequestParam Integer restaurantId) {
//        return RestaurantService.removerestaurant(restaurantId);
//
//    }

}
