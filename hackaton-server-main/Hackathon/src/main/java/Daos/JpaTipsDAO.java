package Daos;

import Model.Tip;
import org.springframework.stereotype.Repository;

@Repository
public class JpaTipsDAO extends GenericJpaDAO<Tip>{
    public JpaTipsDAO(Class<Tip> modelType) {
        super(modelType);
    }
}
