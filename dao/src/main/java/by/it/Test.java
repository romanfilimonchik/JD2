package by.it;

import by.it.connection.ConnectionCreator;
import by.it.dao.DAO;
import by.it.entities.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лёша on 08.01.2017.
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        boolean isUserExist = false;


        DAO dao = DAO.getDAO();
        List<User> users = dao.user.getAll();

        String com = null;
        String inputLogin = "borisenok";
        String inputPassword = "borisenok";

        for (int i = 0; i < users.size(); i++) {

           String searchLogin = users.get(i).getLogin();
            String searchPassword = users.get(i).getPassword();
            System.out.println(searchLogin + " " + searchPassword);


            if ((searchLogin.equals(inputLogin)) && (searchPassword.equals(inputPassword))){
                System.out.println("!!");
            }

        }

//        if (isUserExist) {
//            HttpSession session = req.getSession(true);
//            String email= user.getEmail();
//            session.setAttribute("user", user);
//            req.setAttribute("message", email);
//        } else {
//            req.setAttribute("message", "NO SUCH USER");
//        }
//        return  "index";
//
    }
}

