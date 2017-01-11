package by.it.dto;

/**
 * Created by Лёша on 10.01.2017.
 */
public class ShoesDTO {
    private int id;
    private String sex;
    private String type;
    private String color;
    private double price;
    private String image;

    public ShoesDTO() {
    }

    public ShoesDTO(int id, String sex, String type, String color, double price, String image) {
        this.id = id;
        this.sex = sex;
        this.type = type;
        this.color = color;
        this.price = price;
        this.image = image;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
