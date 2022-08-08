package Services;

import Daos.JPADistrictDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictService {

private JPADistrictDAO districtDAO;

    public JPADistrictDAO getDistrictDAO() {
        return districtDAO;
    }

    @Autowired
    public void setDistrictDAO(JPADistrictDAO districtDAO) {
        this.districtDAO = districtDAO;
    }

}
