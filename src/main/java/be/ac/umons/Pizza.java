package be.ac.umons;

import java.util.ArrayList;

import java.math.BigDecimal;

public class Pizza {
    private String name;
    private BigDecimal price;
    private ArrayList<Ingredient> listingredients;

    Pizza(String name, BigDecimal price){};

    public String getName(Ingredient i){
        return i.getName();
    }

    public BigDecimal getPrice(Ingredient i){
        return i.getPrice();
    }

    public void setName(String n){
        this.name = n;
    }

    public void setPrice(BigDecimal p){
        this.price = p;
    }

    public ArrayList<Ingredient>getListingredients(){
        return listingredients;
    }

    public void addingredient(Ingredient i){
        this.listingredients.add(i);
    }
    public String toString(){
        return this.toString();
    }
}