package Controller;

import Model.User;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

   

    private User user;

    public MainController() {

    }

    public Integer getBombasticLevel(){
        return user.getBombasticLevel();
    }


    public void getDinnerResults(){
        getRatingByBombasticLevel();
    }

    public void getBedResults(){
        getRatingByBombasticLevel();
    }

    public void getDanceResults(){
        getRatingByBombasticLevel();
    }

    public void getRatingByBombasticLevel(){
        switch (user.getBombasticLevel()) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
        }
    }

}
