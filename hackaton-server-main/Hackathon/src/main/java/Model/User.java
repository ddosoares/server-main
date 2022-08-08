package Model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(
        name = "users"
)

public class User extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer bombasticLevel;

    private String nickName;

    @ManyToOne
    private District district;

    public Integer getBombasticLevel() {
        return bombasticLevel;
    }

    public void setBombasticLevel(Integer bombasticLevel) {
        this.bombasticLevel = bombasticLevel;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public District getDistrict() {
        return district;
    }


    public void setDistrict(District district) {
        this.district = district;
    }
}