package by.it.dto;

/**
 * Created by Лёша on 10.01.2017.
 */
public class MyOrderDTO {
    private int id;
    private int shoes_id;
    private String sex;
    private String type;
    private String color;
    private double price;
    private byte[] image;
    private String login;
    private String email;
    private int count;


    public MyOrderDTO() {
    }

    public MyOrderDTO(int id, int shoes_id, String sex, String type, String color, double price, byte[] image, String login, String email, int count) {
        this.id = id;
        this.shoes_id = shoes_id;
        this.sex = sex;
        this.type = type;
        this.color = color;
        this.price = price;
        this.image = image;
        this.login = login;
        this.email = email;
        this.count = count;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
