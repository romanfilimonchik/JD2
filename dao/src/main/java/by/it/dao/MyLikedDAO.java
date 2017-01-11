package by.it.dao;

import by.it.connection.ConnectionCreator;
import by.it.entities.MyLiked;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лёша on 10.01.2017.
 */
public class MyLikedDAO extends AbstractDAO implements InterfaceDAO<MyLiked> {
    @Override
    public MyLiked read(int id) {
        return null;
    }

    @Override
    public boolean create(MyLiked myLiked) {
        String sql = String.format(
                "INSERT INTO `myliked`( `shoes_id` ,`user_id`)" +
                        " VALUES('%d','%d');",
                myLiked.getShoes(), myLiked.getUser()
        );
        myLiked.setId(executeUpdate(sql));
        return (myLiked.getId()>0);
    }

    @Override
    public boolean update(MyLiked entity) {
        return false;
    }

    @Override
    public boolean delete(MyLiked entity) {
        return false;
    }

    @Override
    public List<MyLiked> getAll() {
        List<MyLiked> myLikeds = new ArrayList<>();
        String sql = "SELECT * FROM myliked;";
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                MyLiked myLiked = new MyLiked();
                myLiked.setId(rs.getInt("id"));
                myLiked.setShoes(rs.getInt("shoes_id"));
                myLiked.setUser(rs.getInt("user_id"));
                myLikeds.add(myLiked);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return myLikeds;
    }
}
