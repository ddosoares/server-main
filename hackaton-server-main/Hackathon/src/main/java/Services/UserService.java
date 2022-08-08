package Services;

import Daos.JpaUserDAO;
import Model.District;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

private JpaUserDAO userDAO;

    public JpaUserDAO getUserDAO() {
        return userDAO;
    }

    @Autowired
    public void setUserDAO(JpaUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional

    public void createUser(String nickName, Integer bombasticLevel, District location){

        User user = new User();
        user.setBombasticLevel(bombasticLevel);
        user.setNickName(nickName);
        user.setDistrict(location);
        userDAO.saveOrUpdate(user);

    }

}
