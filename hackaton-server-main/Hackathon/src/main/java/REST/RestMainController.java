package REST;

import Model.Bed;
import Model.District;
import Model.Pub;
import Model.Restaurant;
import Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(
        origins = {"*"},
        maxAge = 3600L
)
@RestController
@RequestMapping({"/"})
public class RestMainController {

    private TipsService tipsService;
    private UserService userService;

    private BedService bedService;
    private RestaurantService restaurantService;
    private PubService pubService;

    public TipsService getTipsService() {
        return tipsService;
    }


    @Autowired
    public void setTipsService(TipsService tipsService) {
        this.tipsService = tipsService;
    }

    public UserService getUserService() {
        return userService;
    }


    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public BedService getBedService() {
        return bedService;
    }


    @Autowired
    public void setBedService(BedService bedService) {
        this.bedService = bedService;
    }

    public RestaurantService getRestaurantService() {
        return restaurantService;
    }

    @Autowired
    public void setRestaurantService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    public PubService getPubService() {
        return pubService;
    }


    @Autowired
    public void setPubService(PubService pubService) {
        this.pubService = pubService;
    }


    @PostMapping(path = {"/api/user/{nickname}/{local}/{bombasticlevel}"})
    public ResponseEntity<HttpStatus> addUser(@PathVariable Integer bombasticlevel, @PathVariable District local, @PathVariable String nickname){
        userService.createUser(nickname,bombasticlevel,local);
       return  new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = {"/api/bed/{local}/{bombasticlevel}"})
    public ResponseEntity<Bed> getBed(@PathVariable Integer bombasticlevel, @PathVariable District local){

        Bed bed = bedService.getBestMatch(bombasticlevel,local);

        return new ResponseEntity<>(bed, HttpStatus.OK);
    }

    @GetMapping(path = {"/api/restaurant/{local}/{bombasticlevel}"})
    public ResponseEntity<Restaurant> getRestaurant(@PathVariable Integer bombasticlevel, @PathVariable District local){

        Restaurant restaurant = restaurantService.getBestMatch(bombasticlevel,local);

        return new ResponseEntity<>(restaurant, HttpStatus.OK);
    }

    @GetMapping(path = {"/api/pub/{local}/{bombasticlevel}"})
    public ResponseEntity<Pub> getPub(@PathVariable Integer bombasticlevel, @PathVariable District local){

        Pub pub = pubService.getBestMatch(bombasticlevel,local);

        return new ResponseEntity<>(pub, HttpStatus.OK);
    }

}




