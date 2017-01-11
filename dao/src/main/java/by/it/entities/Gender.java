package by.it.entities;

/**
 * Created by Лёша on 04.01.2017.
 */
public class Gender {
    private int id;
    private String sex;

    public Gender() {
    }

    public Gender(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
