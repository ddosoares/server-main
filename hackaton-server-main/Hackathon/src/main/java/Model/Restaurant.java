package Model;

import javax.persistence.*;

@Entity
@Table(name = "restaurants")
public class Restaurant extends ProductService{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   private String name;

   private Float rating;

   private Integer price;

   private String image;

   @ManyToOne()
   private District district;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Float getRating() {
      return rating;
   }

   public void setRating(Float rating) {
      this.rating = rating;
   }

   public Integer getPrice() {
      return price;
   }

   public void setPrice(Integer price) {
      this.price = price;
   }

   public String getImage() {
      return image;
   }

   public void setImage(String image) {
      this.image = image;
   }
}
