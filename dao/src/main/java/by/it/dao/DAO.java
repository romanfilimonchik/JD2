package by.it.dao;

import by.it.entities.MyBasket;
import by.it.entities.MyLiked;
import by.it.entities.MyOrder;

/**
 * Created by Лёша on 04.01.2017.
 */
public class DAO {
    private static DAO dao;

    public UserDAO user;
    public ModelDAO model;
    public GenderDAO gender;
    public ShoesDAO shoes;
    public MyBasketDAO myBasket;
    public MyOrderDAO myOrder;
    public MyLikedDAO myLiked;
    public DtoDAO dtoDAO;

    public static DAO getDAO(){
        if (dao == null){
            synchronized (DAO.class){
                if (dao == null){
                    dao = new DAO();
                    dao.user = new UserDAO();
                    dao.model = new ModelDAO();
                    dao.gender = new GenderDAO();
                    dao.shoes = new ShoesDAO();
                    dao.myBasket = new MyBasketDAO();
                    dao.myOrder = new MyOrderDAO();
                    dao.myLiked = new MyLikedDAO();
                    dao.dtoDAO = new DtoDAO();
                    //...
                }
            }
        }
        return dao;
    }
}
