package by.it.controller.cmd;

import by.it.controller.Action;
import by.it.dao.DAO;
import by.it.entities.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Лёша on 08.01.2017.
 */
public class CmdLogin extends Action {
    public String execute(HttpServletRequest req) {
        boolean isUserExist = false;
        User user = new User();
        try {
            user.setLogin(req.getParameter("login"));
            user.setPassword(req.getParameter("password"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        DAO dao = DAO.getDAO();
        List<User> users = dao.user.getAll();

        String inputLogin= user.getLogin();
        String inputPassword = user.getPassword();

        for (int i = 0; i < users.size(); i++) {

            String searchLogin = users.get(i).getLogin();
            String searchPassword = users.get(i).getPassword();

            if ((searchLogin.equals(inputLogin)) && (searchPassword.equals(inputPassword))){
                isUserExist = true;
                user.setId(users.get(i).getId());
            }

        }

        if (isUserExist) {
            HttpSession session = req.getSession(true);
            session.setAttribute("user", user);
        } else {
            req.setAttribute("message", "NO SUCH USER");
        }
        return  "index";
    }
}
