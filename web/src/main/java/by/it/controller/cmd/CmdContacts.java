package by.it.controller.cmd;

import by.it.controller.Action;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Лёша on 08.01.2017.
 */
public class CmdContacts extends Action {

    @Override
    public String execute(HttpServletRequest reg) {
        return "contacts";
    }
}
