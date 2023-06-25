package repository;

import model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {

    @Autowired
    private List<Restaurant> myRestaurant;

    public  List<Restaurant> getMyRestaurants() {

        return myRestaurant;
    }

    public void add(Restaurant restaurant)
    {
        myRestaurant.add(restaurant);
    }

    public void delete(Restaurant restaurant)
    {

        myRestaurant.remove(restaurant);
    }

}
