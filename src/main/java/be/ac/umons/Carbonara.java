package be.ac.umons;

import java.math.BigDecimal;

import java.util.ArrayList;

public class Carbonara extends Pizza {
    Carbonara(){
            super("Carbonara");
            BigDecimal p,a;
            int n;
            addingredient(new Dough());
            addingredient(new WhiteCream());
            addingredient(new Cheese());
            addingredient(new Ham());
            n = getListingredients().size();
            for (int i = 0;i < n;i++){
                a = getListingredients().get(i).getPrice();
                p = p + a;
            }
            Pizza.Setprice(p);

    }
}

