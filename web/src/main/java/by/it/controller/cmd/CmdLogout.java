package by.it.controller.cmd;

import by.it.controller.Action;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Лёша on 08.01.2017.
 */
public class CmdLogout extends Action {
    public String execute(HttpServletRequest req) {
        req.getSession().invalidate();

        return null;
    }
}
