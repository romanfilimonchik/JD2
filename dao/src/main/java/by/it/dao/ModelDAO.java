package by.it.dao;

import by.it.connection.ConnectionCreator;
import by.it.entities.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лёша on 04.01.2017.
 */
public class ModelDAO extends AbstractDAO implements InterfaceDAO<Model> {

    @Override
    public Model read(int id) {
        return null;
    }

    @Override
    public boolean create(Model entity) {
        return false;
    }

    @Override
    public boolean update(Model entity) {
        return false;
    }

    @Override
    public boolean delete(Model entity) {
        return false;
    }

    @Override
    public List<Model> getAll() {
        List<Model> models = new ArrayList<>();
        String sql = "SELECT * FROM models;";
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Model model = new Model();
                model.setId(rs.getInt("id"));
                model.setType(rs.getString("type"));
                models.add(model);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return models;
    }
}
