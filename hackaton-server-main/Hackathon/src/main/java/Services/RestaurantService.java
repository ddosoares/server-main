package Services;

import Daos.JPARestaurantDAO;
import Model.Bed;
import Model.District;
import Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService implements Services<Restaurant>{
    public JPARestaurantDAO getRestaurantDAO() {
        return restaurantDAO;
    }

    @Autowired
    public void setRestaurantDAO(JPARestaurantDAO restaurantDAO) {
        this.restaurantDAO = restaurantDAO;
    }

    private JPARestaurantDAO restaurantDAO;

    public Restaurant getBestMatch(Integer bombasticLevel, District district) {
        // Não precisamos dos districts. Importa o bombastic Level de cada Bed por distrito
        List<Restaurant> bedList = restaurantDAO.findAll();

        switch (bombasticLevel){
            case 1:
                return  restaurantDAO.getMatch(3, district);


            case 2:
                return restaurantDAO.getMatch(2, district);


            case 3:
                return restaurantDAO.getMatch(1, district);

        }
        return null;
    }
}
