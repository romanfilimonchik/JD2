package by.it.dao;

import by.it.connection.ConnectionCreator;
import by.it.entities.MyOrder;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лёша on 10.01.2017.
 */
public class MyOrderDAO extends AbstractDAO implements InterfaceDAO<MyOrder>{

    @Override
    public MyOrder read(int id) {
        return null;
    }

    @Override
    public boolean create(MyOrder myOrder) {
        String sql = String.format(
                "INSERT INTO `myorder`( `shoes_id` ,`user_id`, `count`)" +
                        " VALUES('%d','%d','%d');",
                myOrder.getShoes(), myOrder.getUser(), myOrder.getCount()
        );
        myOrder.setId(executeUpdate(sql));
        return (myOrder.getId()>0);
    }

    @Override
    public boolean update(MyOrder entity) {
        return false;
    }

    @Override
    public boolean delete(MyOrder entity) {
        return false;
    }

    @Override
    public List<MyOrder> getAll() {
        List<MyOrder> myOrders = new ArrayList<>();
        String sql = "SELECT * FROM myorder;";
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                MyOrder myOrder = new MyOrder();
                myOrder.setId(rs.getInt("id"));
                myOrder.setShoes(rs.getInt("shoes_id"));
                myOrder.setUser(rs.getInt("user_id"));
                myOrder.setCount(rs.getInt("count"));
                myOrders.add(myOrder);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return myOrders;
    }
}
