import javafx.scene.transform.NonInvertibleTransformException;

import java.util.Date;
import java.util.List;

public class Item {
    private String name;
    private double price;
    private String date;
    private String[] restriction;
    private int quantity;

    public Item(){

    }

    public Item(String name, double price, String date, String[] restriction, int quantity){
        this.name=name;
        this.price=price;
        this.date=date;
        this.restriction=restriction;
        this.quantity=quantity;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public String getDate(){
        return this.date;
    }

    public void setDate(String date){
        this.date=date;
    }

    public String[] getRestriction(){
        return this.restriction;
    }

    public void setRestriction(String[] restriction){
        this.restriction=restriction;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }



}
