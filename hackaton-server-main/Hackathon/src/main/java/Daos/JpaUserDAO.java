package Daos;

import Model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDAO extends GenericJpaDAO<User>{

    public JpaUserDAO(Class<User> modelType) {
        super(modelType);
    }
}
