package by.it.entities;

/**
 * Created by Лёша on 03.01.2017.
 */
public class Shoes {
    private int id;
    private int gender_id;
    private int model_id;
    private String color;
    private double price;
    private String image;

    public Shoes() {
    }

    public Shoes(int id, int gender_id, int model_id, String color, double price, String image) {
        this.id = id;
        this.gender_id = gender_id;
        this.model_id = model_id;
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

    public int getGender_id() {
        return gender_id;
    }

    public void setGender_id(int gender_id) {
        this.gender_id = gender_id;
    }

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
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
