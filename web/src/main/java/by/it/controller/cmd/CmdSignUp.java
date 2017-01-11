package by.it.controller.cmd;

import by.it.controller.Action;
import by.it.dao.DAO;
import by.it.entities.User;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Лёша on 08.01.2017.
 */
public class CmdSignUp extends Action {
    public String execute(HttpServletRequest req) {
        if ("GET".equals(req.getMethod())){
            return "signup";
        } else {
            User user = new User();
            try {
                user.setId(0);
                user.setLogin(req.getParameter("login"));
                System.out.println(req.getParameter("login"));
                user.setPassword(req.getParameter("password"));
                System.out.println(req.getParameter("password"));
                user.setEmail(req.getParameter("email"));
                System.out.println(req.getParameter("email"));
            } catch (Exception e){
                e.printStackTrace();
            }

            DAO dao = DAO.getDAO();
            if (dao.user.create(user)) {
                return "index";
            } else
                return "error";
        }

    }
}
