package Services;

import Daos.JPABedDAO;
import Model.Bed;
import Model.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.JdbcUpdateAffectedIncorrectNumberOfRowsException;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.ArrayList;
import java.util.List;


@Service
public class BedService implements Services<Bed> {

    private JPABedDAO bedDAO;

    public JPABedDAO getBedDAO() {
        return bedDAO;
    }

    @Autowired
    public void setBedDAO(JPABedDAO bedDAO) {
        this.bedDAO = bedDAO;
    }

    @Override
    public Bed getBestMatch(Integer bombasticLevel, District district) {
        List<Bed> bedList = bedDAO.findAll();

        switch (bombasticLevel) {
            case 1:
                return bedDAO.getMatch(3, district);
            case 2:
                return bedDAO.getMatch(2, district);
            case 3:
                return bedDAO.getMatch(1, district);
        }
        return null;
    }


}


