package by.it.dao;

import by.it.connection.ConnectionCreator;
import by.it.entities.Gender;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лёша on 04.01.2017.
 */
public class GenderDAO extends AbstractDAO implements InterfaceDAO<Gender> {
    @Override
    public Gender read(int id) {
        return null;
    }

    @Override
    public boolean create(Gender entity) {
        return false;
    }

    @Override
    public boolean update(Gender entity) {
        return false;
    }

    @Override
    public boolean delete(Gender entity) {
        return false;
    }

    @Override
    public List<Gender> getAll() {
        List<Gender> genders = new ArrayList<>();
        String sql = "SELECT * FROM gender;";
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Gender gender = new Gender();
                gender.setId(rs.getInt("id"));
                gender.setSex(rs.getString("sex"));
                genders.add(gender);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return genders;
    }
}
