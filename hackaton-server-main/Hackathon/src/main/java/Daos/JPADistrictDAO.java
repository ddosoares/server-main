package Daos;

import Model.District;

public class JPADistrictDAO extends GenericJpaDAO<District> {
    public JPADistrictDAO(Class<District> modelType) {
        super(modelType);
    }
}
