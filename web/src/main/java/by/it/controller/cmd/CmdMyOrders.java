package by.it.controller.cmd;

import by.it.controller.Action;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Лёша on 08.01.2017.
 */
public class CmdMyOrders extends Action{
    public String execute(HttpServletRequest req) {
        if ("GET".equals(req.getMethod())) {
            return "myorders";
        } else {
            return null;
        }
    }
}
