package Services;

import Daos.JPAPubDAO;
import Model.Bed;
import Model.District;
import Model.Pub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PubService implements Services<Pub>{

private JPAPubDAO pubDAO;

    public JPAPubDAO getPubDAO() {
        return pubDAO;
    }

    @Autowired
    public void setPubDAO(JPAPubDAO pubDAO) {
        this.pubDAO = pubDAO;
    }

    public Pub getBestMatch(Integer bombasticLevel, District district) {
        List<Pub> pubs = pubDAO.findAll();

        switch (bombasticLevel){
            case 1:
                return  pubDAO.getMatch(3, district);
            case 2:
                return pubDAO.getMatch(2, district);
            case 3:
                return pubDAO.getMatch(1, district);
        }
        return null;
    }
}
