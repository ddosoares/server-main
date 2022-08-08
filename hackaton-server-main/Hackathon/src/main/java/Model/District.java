package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "districts")
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @OneToMany(
            cascade = {CascadeType.ALL},
            mappedBy = "district",
            fetch = FetchType.EAGER
    )
    private List<Restaurant> restaurants = new ArrayList<>();

    @OneToMany(
            cascade = {CascadeType.ALL},
            mappedBy = "districtPub",
            fetch = FetchType.EAGER
    )
    private  List<Pub> pubs = new ArrayList<>();

    @OneToMany(
            cascade = {CascadeType.ALL},
            mappedBy = "district",
            fetch = FetchType.EAGER
    )
    private  List<Bed> beds = new ArrayList<>();
}
