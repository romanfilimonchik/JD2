package by.it.entities;

/**
 * Created by Лёша on 10.01.2017.
 */
public class MyBasket {
    private int id;
    private int shoes_id;
    private int user_id;

    public MyBasket() {
    }

    public MyBasket(int id, int shoes_id, int user_id) {
        this.id = id;
        this.shoes_id = shoes_id;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShoes() {
        return shoes_id;
    }

    public void setShoes(int shoes_id) {
        this.shoes_id = shoes_id;
    }

    public int getUser() {
        return user_id;
    }

    public void setUser(int user_id) {
        this.user_id = user_id;
    }

}
