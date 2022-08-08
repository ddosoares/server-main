package Daos;

import Model.Bed;
import Model.District;
import Model.Restaurant;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Repository
public class JPARestaurantDAO extends GenericJpaDAO<Restaurant> {

    public JPARestaurantDAO(Class<Restaurant> modelType) {
        super(modelType);
    }

    public Restaurant getMatch(Integer price, District district) {



        // 1 - get a CriteriaBuilder object from the EntityManager
        CriteriaBuilder builder = em.getCriteriaBuilder();

        // 2 - create a new CriteriaQuery instance for the Customer entity
        CriteriaQuery<Restaurant> criteriaQuery = builder.createQuery(Restaurant.class);

        // 3 - get the root of the query, from where all navigation starts
        Root<Restaurant> root = criteriaQuery.from(Restaurant.class);

        // 4 - specify the item that is to be returned in the query result
        criteriaQuery.select(root);

        Predicate[] predicates = new Predicate[2];
        predicates[0] = builder.equal(root.get("price"), price);
        predicates[1] = builder.equal(root.get("district"), district);

        criteriaQuery.select(root).where(predicates);



        // 6 - create and execute a query using the criteria
        return em.createQuery(criteriaQuery).getSingleResult();

    }

}
