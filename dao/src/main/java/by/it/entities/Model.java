package by.it.entities;

/**
 * Created by Лёша on 04.01.2017.
 */
public class Model {
    private int id;
    private String type;

    public Model(){

    }

    public Model(int id, String type){
        this.id =id;
        this.type = type;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

}
