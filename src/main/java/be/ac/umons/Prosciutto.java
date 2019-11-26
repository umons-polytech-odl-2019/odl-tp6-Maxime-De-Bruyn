package be.ac.umons;

public class Prosciutto extends Pizza{
    Prosciutto(){
        super("Prosciutto");
        addingredient(new Dough());
        addingredient(new TomatoSauce());
        addingredient(new Cheese());
        addingredient(new Ham());
    }
}
