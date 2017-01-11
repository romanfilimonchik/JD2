package by.it.dao;

import by.it.connection.ConnectionCreator;
import by.it.entities.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лёша on 03.01.2017.
 */
public class UserDAO extends AbstractDAO implements InterfaceDAO<User>{
    @Override
    public User read(int id) {
        return null;
    }

    @Override
    public boolean create(User user) {
        String sql = String.format(
                "INSERT INTO `users`( `login` ,`password`, `email`)" +
                        " VALUES('%s','%s','%s');",
                user.getLogin(), user.getPassword(), user.getEmail()
        );
        user.setId(executeUpdate(sql));
        return (user.getId()>0);
    }


    @Override
    public boolean update(User entity) {
        return false;
    }

    @Override
    public boolean delete(User entity) {
        return false;
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users;";
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                users.add(user);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }
}
