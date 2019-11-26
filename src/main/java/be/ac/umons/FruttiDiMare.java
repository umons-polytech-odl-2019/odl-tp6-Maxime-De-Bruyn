package be.ac.umons;

public class FruttiDiMare extends Pizza{
    FruttiDiMare(){
        super("FruttiDiMare");
        addingredient(new Dough());
        addingredient(new TomatoSauce());
        addingredient(new Cheese());
        addingredient(new Seafood());


    }
}