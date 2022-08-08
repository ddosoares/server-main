package Daos;

import java.util.List;

public interface GenericDAO<T> {

    List<T> findAll();

    T findById(Integer id);

    T saveOrUpdate(T modelObject);

    void delete(Integer id);

}
