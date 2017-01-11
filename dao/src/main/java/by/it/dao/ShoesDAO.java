package by.it.dao;

import by.it.connection.ConnectionCreator;
import by.it.entities.Shoes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лёша on 03.01.2017.
 */
public class ShoesDAO extends AbstractDAO implements InterfaceDAO<Shoes>{

    @Override
    public Shoes read(int id) {
        return null;
    }

    @Override
    public boolean create(Shoes entity) {
        return false;
    }

    @Override
    public boolean update(Shoes entity) {
        return false;
    }

    @Override
    public boolean delete(Shoes entity) {
        return false;
    }

    @Override
    public List<Shoes> getAll() {
        List<Shoes> shoess = new ArrayList<>();
        String sql = "SELECT * FROM shoes;";
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Shoes shoes = new Shoes();
                shoes.setId(rs.getInt("id"));
                shoes.setGender_id(rs.getInt("gender_id"));
                shoes.setModel_id(rs.getInt("model_id"));
                shoes.setColor(rs.getString("color"));
                shoes.setPrice(rs.getDouble("price"));
                shoes.setImage(rs.getString("img"));
                shoess.add(shoes);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return shoess;
    }
}
