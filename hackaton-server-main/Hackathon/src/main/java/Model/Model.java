package Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private Integer dinnerResults;
    private Integer danceResults;

    private Integer bedResults;



    public Integer getDinnerResults() {
        return dinnerResults;
    }

    public void setDinnerResults(Integer dinnerResults) {
        this.dinnerResults = dinnerResults;
    }

    public Integer getDanceResults() {
        return danceResults;
    }

    public void setDanceResults(Integer danceResults) {
        this.danceResults = danceResults;
    }

    public Integer getBedResults() {
        return bedResults;
    }

    public void setBedResults(Integer bedResults) {
        this.bedResults = bedResults;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
