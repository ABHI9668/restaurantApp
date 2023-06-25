package service;

import model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RestaurantRepo;

import java.util.List;


@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;
//    public static String removerestaurant(Integer restaurantId) {
//
//        for(Restaurant myResataurant : restaurantRepo.getMyRestaurants())
//        {
//            if(myResataurant.getRestaurantId().equals(restaurantId))
//            {
//                restaurantRepo.delete(myResataurant);
//                return "restaurant removed for restaurant ID:" + restaurantId;
//            }
//        }
//        return "restaurant :" + restaurantId + " not deleted as it doesn't exist" ;
//    }

    public List<Restaurant> getAllRestaurants() {
       return restaurantRepo.getMyRestaurants();
    }

    public Restaurant getRestaurantById(Integer restaurantId) {
        for(Restaurant restaurant : restaurantRepo.getMyRestaurants())
        {
            if(restaurant.getRestaurantId().equals(restaurantId))
            {
                return restaurant;
            }
        }
        throw new IllegalStateException("id not found");
    }


    public String addrestaurant(Restaurant myrestaurant) {
        restaurantRepo.add(myrestaurant);
        return "Restaurant added";
    }

}
