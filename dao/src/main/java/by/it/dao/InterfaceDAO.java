package by.it.dao;

import java.util.List;

/**
 * Created by Лёша on 03.01.2017.
 */
public interface InterfaceDAO<TYPE> {
    TYPE read(int id);

    boolean create(TYPE entity);
    boolean update(TYPE entity);
    boolean delete(TYPE entity);

    List<TYPE> getAll();
}
