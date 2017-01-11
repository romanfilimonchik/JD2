package by.it.dao;

import by.it.connection.ConnectionCreator;
import by.it.entities.MyBasket;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лёша on 10.01.2017.
 */
public class MyBasketDAO extends AbstractDAO implements InterfaceDAO<MyBasket> {
    @Override
    public MyBasket read(int id) {
        return null;
    }

    @Override
    public boolean create(MyBasket myBasket) {
        String sql = String.format(
                "INSERT INTO `mybasket`( `shoes_id` ,`user_id`)" +
                        " VALUES('%d','%d');",
                myBasket.getShoes(), myBasket.getUser()
        );
        myBasket.setId(executeUpdate(sql));
        return (myBasket.getId()>0);
    }

    @Override
    public boolean update(MyBasket entity) {
        return false;
    }

    @Override
    public boolean delete(MyBasket entity) {
        return false;
    }

    @Override
    public List<MyBasket> getAll() {
        List<MyBasket> myBaskets = new ArrayList<>();
        String sql = "SELECT * FROM mybasket;";
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                MyBasket myBasket = new MyBasket();
                myBasket.setId(rs.getInt("id"));
                myBasket.setShoes(rs.getInt("shoes_id"));
                myBasket.setUser(rs.getInt("user_id"));
                myBaskets.add(myBasket);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return myBaskets;
    }
}
