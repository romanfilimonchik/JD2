package by.it.controller.cmd;

import by.it.controller.Action;
import by.it.dao.DAO;
import by.it.dto.ShoesDTO;
import by.it.entities.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Лёша on 08.01.2017.
 */
public class CmdIndex extends Action {

    public String execute(HttpServletRequest reg) {


        DAO dao = DAO.getDAO();


        List<ShoesDTO> shoess = dao.dtoDAO.getAllShoesDTO();



        reg.setAttribute("shoess", shoess);

        return "index";
    }
}
