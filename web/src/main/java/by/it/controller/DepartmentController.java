package by.it.controller;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Лёша on 04.01.2017.
 */
public class DepartmentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Action action = Actions.defineFrom(req);
        String nexAction = action.execute(req);

        if (nexAction.equals("index")){

        RequestDispatcher r = getServletContext().getRequestDispatcher(action.getJsp(nexAction));
        r.forward(req, resp);

        if (nexAction == null) {
            RequestDispatcher r = getServletContext().getRequestDispatcher(action.getJsp());
            r.forward(req, resp);
        } else
            resp.sendRedirect("do?command="+nexAction);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Action action = Actions.defineFrom(req);
        String nexAction = action.execute(req);

        RequestDispatcher r = getServletContext().getRequestDispatcher(action.getJsp(nexAction));
        r.forward(req, resp);
//        if (nexAction == null) {
//            RequestDispatcher r = getServletContext().getRequestDispatcher(action.getJsp());
//            r.forward(req, resp);
//        } else
//            resp.sendRedirect("do?command="+nexAction);
    }
}