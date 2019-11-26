package be.ac.umons;

public class Margherita extends Pizza {
    Margherita(){
        super("Margherita");
        addingredient(new Dough());
        addingredient(new TomatoSauce());
        addingredient(new Cheese());
    }
}
